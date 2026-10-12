public class Question03 {
    double radius;
    static double PI = 3.14;

    Question03(double r) {
        radius = r;
    }

    void calculate() {
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("Area = " + area);
        System.out.println("Circumference = " + circumference);
    }

    public static void main(String[] args) {
        Question03 c1 = new Question03(7);
        c1.calculate();
    }
}

