abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double r;
    Circle(double radius) { r = radius; }
    double area() { return 3.14 * r * r; }
}

class Rectangle extends Shape {
    double l, b;
    Rectangle(double x, double y) { l = x; b = y; }
    double area() { return l * b; }
}

public class Question23 {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4,6);
        System.out.println("Circle Area = " + c.area());
        System.out.println("Rectangle Area = " + r.area());
    }
}

