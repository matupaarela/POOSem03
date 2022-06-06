package abstracts;

import java.util.ArrayList;
import java.util.Collection;

public class Run {
    public static void main(String[] args) {
        Collection<Shape> allShapes = new ArrayList<>();

        // Draw Circle
        Circle circle = new Circle();
        circle.radius = 10;
        allShapes.add(circle);

        // Draw Rectangle
        Rectangle rectangle = new Rectangle();
        rectangle.width = 20;
        rectangle.height = 10;
        allShapes.add(rectangle);

        // Imprimiendo el area total de todos los dibujos
        double total = 0.0;
        for (Shape s : allShapes) {
            total += s.computeArea();
        }
        System.out.println("Areas totales: " + total);
    }
}
