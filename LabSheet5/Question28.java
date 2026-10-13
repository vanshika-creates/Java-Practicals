interface Calculator {
    int add(int a, int b);
    int multiply(int a, int b);
}

class SimpleCalculator implements Calculator {
    public int add(int a, int b) { return a + b; }
    public int multiply(int a, int b) { return a * b; }
}

public class Question28 {
    public static void main(String[] args) {
        Calculator c = new SimpleCalculator();
        System.out.println("Addition = " + c.add(5,3));
        System.out.println("Multiplication = " + c.multiply(5,3));
    }
}

