package io.codelex.oop.exercise_9_10;

public class Triangle extends Shape {

    private final double sideLength;

    public Triangle(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 3;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength / 2;
    }
}
