public class Question23 {
    static int totalPrimeChecks = 0;

    void checkPrime(int num) {
        boolean isPrime = true;
        if (num <= 1) isPrime = false;
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        totalPrimeChecks++;
        if (isPrime)
            System.out.println(num + " is Prime");
        else
            System.out.println(num + " is NOT Prime");
    }

    public static void main(String[] args) {
        Question23 pc = new Question23();
        pc.checkPrime(7);
        pc.checkPrime(10);
        System.out.println("Total prime checks = " + totalPrimeChecks);
    }
}

