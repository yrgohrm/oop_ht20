public class Triangle extends Shape {
    private int width;
    private int height;
    private double angle;

    public Triangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height / 2.0;
    }

    public void setTopAngle(double angle) {
        this.angle = angle;
    }
}
