import java.util.Scanner;

public class Question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Multiply by 2: " + (num << 1));

        System.out.println("Divide by 2: " + (num >> 1));

        System.out.println("Multiply by 4: " + (num << 2));
        
        System.out.println("Divide by 4: " + (num >> 2));
    }
}

