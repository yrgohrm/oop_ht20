import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        
        Shape rect = new Rectangle(10, 20);
    
        System.out.println(rect.getPosX());

        List<Shape> shapes = new ArrayList<>();
        shapes.add(rect);

        for (Shape shape : shapes) {
            System.out.println("area: " + shape.area());
            shape.draw();
        }
    }
}