import java.io.EOFException;

public class Ex5_1 {
    private static void readThePictureFromFile() throws EOFException {
        throw new EOFException();
    }
    
    public static void main(String[] args) {
        try {
            readThePictureFromFile();
        }
        catch (EOFException ex) {
            throw new PictureNotSquareException("EOF reached early", ex);
        }        
    }
}
