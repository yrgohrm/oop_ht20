public class OvningEtt {

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle(12.5, 3.3);
        Rectangle rect3 = new Rectangle(12.5, 3.3);

        rect2.setWidth(99);

        System.out.println(rect);
        System.out.println(rect2);
        System.out.println(rect3);
    }
}
