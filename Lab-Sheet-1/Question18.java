import java.util.Scanner;

public class Question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input object
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // user input
        boolean isPrime = true; // assume prime

        if(n <= 1) isPrime = false; // 0,1,negative not prime
        else {
            for(int i=2; i<=n/2; i++) { // loop till half
                if(n % i == 0) { // divisible means not prime
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }
}
