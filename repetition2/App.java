public class App {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Rectangle bosse = new Rectangle();
        rect.setHeight(123);
        rect2.setHeight(1);
        bosse.setHeight(3);

        String hej = "Hej " + rect;

        System.out.println(hej);
        System.out.println(rect2);
        System.out.println(bosse);
    }
}