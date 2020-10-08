public class Rectangle extends Shape {
    private int width;
    private int height;
    private String text;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    public void setText(String text) {
        this.text = text;
    }
}
