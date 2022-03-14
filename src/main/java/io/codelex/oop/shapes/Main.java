package io.codelex.oop.shapes;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 2);
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getNumSides());

        Rectangle rectangle = new Rectangle(4, 4, 5);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getNumSides());
    }
}
