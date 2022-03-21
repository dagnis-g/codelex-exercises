package io.codelex.oop.exercise_9_10;

public class Qube extends Shape3D {

    private double sideLength;

    public Qube(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculatePerimeter() {
        return sideLength * 12;
    }

    @Override
    double calculateArea() {
        return 6 * (sideLength * sideLength);
    }

    @Override
    public double calculateVolume() {
        return Math.pow(sideLength, 3);
    }
}
