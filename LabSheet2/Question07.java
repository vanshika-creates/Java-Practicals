import java.util.Scanner;

public class Question07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for(int i=1; i<=7; i++) {
            System.out.print("Enter rainfall for day " + i + ": ");
            int rain = sc.nextInt();
            total += rain;
        }

        System.out.println("Total rainfall in 7 days = " + total);
    }
}

