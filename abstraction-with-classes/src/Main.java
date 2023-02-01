

import features.Shape;
import shape.circle;
import shape.Rectangle;

public class Main {
    public static void main(String[] args) {
        Shape circle = new circle(10.0f);
        Shape rectangle = new Rectangle(10.0f, 20.0f);
        circle.calculateArea();
        circle.displayArea();
        rectangle.calculateArea();
        rectangle.displayArea();
    }
}