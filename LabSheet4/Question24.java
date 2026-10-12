public class Question24 {
    static int seriesCount = 0;

    void displaySeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        seriesCount++;
        System.out.println("\nSeries displayed count = " + seriesCount);
    }

    public static void main(String[] args) {
        Question24 f = new Question24();
        f.displaySeries(10);
    }
}

