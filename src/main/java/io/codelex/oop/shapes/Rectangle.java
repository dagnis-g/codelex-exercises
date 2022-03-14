package io.codelex.oop.shapes;

public class Rectangle extends Shape {

    private final int height;
    private final int width;

    public Rectangle(int numSides, int height, int width) {
        super(numSides);
        this.height = height;
        this.width = width;
    }

    @Override
    double getArea() {
        return height * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (height + width);
    }
}
