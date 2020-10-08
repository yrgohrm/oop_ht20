import java.awt.Point;

public abstract class Shape {
    private Point position;

    public void move(int x, int y) {
        this.position = new Point(x, y);
    }

    public Point getPosition() {
        return (Point) position.clone();
    }

    public abstract double area();
}
