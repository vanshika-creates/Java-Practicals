import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String correct = "java123";
        String input;

        do {
            System.out.print("Enter password: ");
            input = sc.next();
        } while(!input.equals(correct));

        System.out.println("Access Granted!");
    }
}

