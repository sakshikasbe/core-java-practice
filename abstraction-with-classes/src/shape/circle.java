package shape;

import features.Shape;

public class circle extends Shape {

    float radius;

    public circle(float radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = Shape.PI * this.radius * this.radius;
    }
}