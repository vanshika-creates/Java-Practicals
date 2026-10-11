import java.util.Scanner;

public class Question26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 5-digit number: ");
        int num = sc.nextInt();

        int last = num % 10;
        int first = num;
        while(first >= 10) {
            first = first / 10; 
        }

        if(first == last)
            System.out.println("First and Last digits are same");
        else
            System.out.println("First and Last digits are different");
    }
}

