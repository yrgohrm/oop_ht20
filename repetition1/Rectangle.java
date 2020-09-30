public class Rectangle {
    private double height;
    private double width;

    public Rectangle() {
        this(12, 78.2);
    }

    public Rectangle(boolean huge) {
        if (huge) {
            height = 10000;
            width = 10000;
        }
        else {
            height = 1;
            width = 1;
        }
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    } 
}
