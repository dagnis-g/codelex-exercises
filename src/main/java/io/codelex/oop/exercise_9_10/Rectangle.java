package io.codelex.oop.exercise_9_10;

public class Rectangle extends Shape {

    private final double sideLength;

    public Rectangle(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 4;
    }

    @Override
    double calculateArea() {
        return sideLength * sideLength;
    }
}
