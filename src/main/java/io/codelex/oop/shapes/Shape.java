package io.codelex.oop.shapes;

abstract class Shape {
    private int numSides;

    public Shape(int numSides) {
        this.numSides = numSides;
    }

    public int getNumSides() {
        return numSides;
    }

    abstract double getArea();

    abstract double getPerimeter();
}
