interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    double r;
    Circle(double radius) { r = radius; }
    public double calculateArea() { return 3.14 * r * r; }
}

class Rectangle implements Shape {
    double l, b;
    Rectangle(double x, double y) { l = x; b = y; }
    public double calculateArea() { return l * b; }
}

public class Question21 {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4,6);

        System.out.println("Circle Area = " + c.calculateArea());
        System.out.println("Rectangle Area = " + r.calculateArea());
    }
}

