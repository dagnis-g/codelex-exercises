package io.codelex.oop.exercise_9_10;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(5);
        System.out.println(triangle.calculatePerimeter());
        System.out.println(triangle.calculateArea());

        Rectangle rectangle = new Rectangle(5);
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(rectangle.calculateArea());

        Hexagon hexagon = new Hexagon(10);
        System.out.println(hexagon.calculatePerimeter());
        System.out.println(hexagon.calculateArea());

        Cone cone = new Cone(5, 10);
        System.out.println(cone.calculatePerimeter());
        System.out.println(cone.calculateArea());
        System.out.println(cone.calculateVolume());

        Qube qube = new Qube(5);
        System.out.println(qube.calculateArea());
        System.out.println(qube.calculatePerimeter());
        System.out.println(qube.calculateVolume());

    }
}
