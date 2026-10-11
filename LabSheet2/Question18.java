public class Question18 {
    public static void main(String[] args) {
        int a = 0, b = 1; // first two terms
        System.out.print("Fibonacci sequence: " + a + " " + b);

        for(int i=3; i<=20; i++) {
            int c = a + b; 
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}

