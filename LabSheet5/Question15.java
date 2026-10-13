class Shape {
    double calculateArea() { return 0; }
}

class Circle extends Shape {
    double r;
    Circle(double radius) { r = radius; }
    @Override double calculateArea() { return 3.14 * r * r; }
}

class Rectangle extends Shape {
    double l, b;
    Rectangle(double x, double y) { l = x; b = y; }
    @Override double calculateArea() { return l * b; }
}

public class Question15 {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4,6);
        System.out.println("Circle Area = " + c.calculateArea());
        System.out.println("Rectangle Area = " + r.calculateArea());
    }
}

