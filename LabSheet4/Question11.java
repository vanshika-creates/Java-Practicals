public class Question11 {
    static int operationsCount = 0; 

    void add(int a, int b) {
        int sum = a + b; 
        operationsCount++;
        System.out.println("Sum = " + sum);
    }

    void subtract(int a, int b) {
        int diff = a - b;
        operationsCount++;
        System.out.println("Difference = " + diff);
    }

    void multiply(int a, int b) {
        int product = a * b;
        operationsCount++;
        System.out.println("Product = " + product);
    }

    void divide(int a, int b) {
        if (b != 0) {
            int result = a / b;
            operationsCount++;
            System.out.println("Division = " + result);
        } else {
            System.out.println("Cannot divide by zero!");
        }
    }

    public static void main(String[] args) {
        Question11 calc = new Question11();
        calc.add(10, 5);
        calc.subtract(10, 5);
        calc.multiply(10, 5);
        calc.divide(10, 5);
        System.out.println("Total operations = " + operationsCount);
    }
}

