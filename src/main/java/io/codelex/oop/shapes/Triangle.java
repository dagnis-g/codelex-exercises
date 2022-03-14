package io.codelex.oop.shapes;

public class Triangle extends Shape {
    private final double width;
    private final double height;

    public Triangle(int numSides, double width, double height) {
        super(numSides);
        this.width = width;
        this.height = height;
    }

    @Override
    double getArea() {
        return (height + width) / 2;
    }

    @Override
    double getPerimeter() {
        return height * height * Math.sqrt(3) / 4;
    }
}
