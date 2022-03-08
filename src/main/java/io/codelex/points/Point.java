package io.codelex.points;

//Points
//
//        Create a class Point that contains x and y coordinates.
//        Create a method in Point class named distanceTo, that receives another Point as a parameter and calculates distance between them.
//
//        See example:
//        Point p1 = new Point(-2, -4);
//        Point p2 = new Point(10, 5);
//
//        BigDecimal distance = p1.distanceTo(p2);
//
//        System.out.println(distance); //should print out 15
//
//        Hint: the mathematical formula of distance between two points is:
//        D=SQRT((𝑥2−𝑥1)^2+(𝑦2−𝑦1)^2)

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distanceTo(Point point) {
        return Math.sqrt(Math.pow(point.getX() - this.getX(), 2) +
                Math.pow(point.getY() - this.getY(), 2));
    }
}

class PointTest{
    public static void main(String[] args) {
        Point p1 = new Point(-2,-4);
        Point p2 = new Point(10,5);

        System.out.println(p1.distanceTo(p2));
    }
}
