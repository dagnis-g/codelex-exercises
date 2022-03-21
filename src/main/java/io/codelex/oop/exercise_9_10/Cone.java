package io.codelex.oop.exercise_9_10;

public class Cone extends Shape3D {

    private final double height;
    private final double width;

    public Cone(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * (width / 2);
    }

    @Override
    double calculateArea() {
        return (Math.PI / 4) * (width * width);
    }

    @Override
    public double calculateVolume() {
        return ((double) 1 / 3) * Math.PI * ((width / 2) * (width / 2)) * height;
    }
}
