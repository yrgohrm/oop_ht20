public class RMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setWidth(10);
        r1.setHeight(10);
        r1.setColor("red");

        String theColor = r1.getColor();
        System.out.println(theColor);
    }
}
