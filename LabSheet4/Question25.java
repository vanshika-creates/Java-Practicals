public class Question25 {
    static int totalCalls = 0;

    void factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        totalCalls++;
        System.out.println("Factorial of " + num + " = " + fact);
    }

    public static void main(String[] args) {
        Question25 f = new Question25();
        f.factorial(5);
        f.factorial(7);
        System.out.println("Total calls = " + totalCalls);
    }
}

