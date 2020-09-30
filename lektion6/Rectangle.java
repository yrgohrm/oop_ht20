public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String toString() {
        return "Rectangle with width " + width + " and height " + height;
    }
}
