import java.util.ArrayList;
import java.util.List;

public class ShapeMain {
    public static void main(String[] args) {
        Triangle t1 = new Triangle(1, 2);
        t1.move(10, 20);
        t1.setTopAngle(22.1);

        Triangle t2 = new Triangle(33, 22);
        t2.move(1, 1);
        t2.setTopAngle(12);

        Rectangle r1 = new Rectangle(5, 50);
        r1.move(99, 0);
        r1.setText("The Rectangle");


        List<Shape> shapes = new ArrayList<>();
        shapes.add(t1);
        shapes.add(t2);
        shapes.add(r1);

        System.out.println(totalArea(shapes));
    }

    private static double totalArea(List<Shape> shapes) {
        double area = 0.0;
        for (Shape s : shapes) {
            area += s.area();
        }
        return area;
    }
}
