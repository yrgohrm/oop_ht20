import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.UUID;

/*

CREATE TABLE contacts (id integer PRIMARY KEY NOT NULL AUTO_INCREMENT,
                       email TEXT NOT NULL,
                       newsletter BOOL NOT NULL,
                       spam BOOL NOT NULL)

*/

public class SimpleJDBC {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/hrmtest?serverTimezone=UTC", "yrgo",
                "yrgo")) {

            String inputFromUser = "%@test.com";
            final String query = "SELECT id, email, newsletter, spam FROM contacts WHERE email like \"" + inputFromUser
                    + "\"";
            ;
            try (Statement stmt = conn.createStatement()) {
                ResultSet rs = stmt.executeQuery(query);

                while (rs.next()) {
                    int id = rs.getInt("id");
                    String email = rs.getString("email");
                    boolean news = rs.getBoolean("newsletter");
                    boolean spam = rs.getBoolean("spam");
                    System.out.printf("%d %s %b %b%n", id, email, news, spam);
                }
            }

            long key = insert(conn, randomEmail(), true, false);
            System.out.println("key: " + key);

            addAll(conn, List.of(randomEmail(), randomEmail()));

            printMatching(conn, true);

        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
        }
    }

    private static void printMatching(Connection conn, boolean newsletter) throws SQLException {
        final String query = "SELECT email FROM contacts WHERE newsletter = ?";
        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setBoolean(1, newsletter);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String email = rs.getString("email");
                System.out.printf("%s %b%n", email, newsletter);
            }
        }
    }

    private static long insert(Connection conn, String email, boolean news, boolean spam) throws SQLException {
        final String insertStmt = "INSERT INTO contacts (email, newsletter, spam) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(insertStmt, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, email);
            stmt.setBoolean(2, news);
            stmt.setBoolean(3, spam);
            stmt.executeUpdate();
            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next()) {
                return keys.getLong(1);
            }

            throw new RuntimeException("oops!");
        }
    }

    public static void addAll(Connection conn, List<String> emails) throws SQLException {
        final String insertStmt = "INSERT INTO contacts (email," + "newsletter,spam) VALUES (?,?,?)";
        conn.setAutoCommit(false);
        try (PreparedStatement stmt = conn.prepareStatement(insertStmt)) {
            for (String email : emails) {
                stmt.setString(1, email);
                stmt.setBoolean(2, true);
                stmt.setBoolean(3, true);
                stmt.executeUpdate();
            }

            conn.commit();
        } catch (SQLException ex) {
            conn.rollback();
            throw ex;
        } finally {
            conn.setAutoCommit(true);
        }
    }

    private static String randomEmail() {
        String str = UUID.randomUUID().toString().replace("-", ".") + "@example.com";
        return str;
    }
}
