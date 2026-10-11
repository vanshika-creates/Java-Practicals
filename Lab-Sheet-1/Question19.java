import java.util.Scanner;

public class Question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operator (+,-,*,/): ");
        char op = sc.next().charAt(0); // operator input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        if(op == '+')
            System.out.println("Result: " + (a+b));
        else if(op == '-')
            System.out.println("Result: " + (a-b));
        else if(op == '*')
            System.out.println("Result: " + (a*b));
        else if(op == '/')
            System.out.println("Result: " + (a/b));
        else
            System.out.println("Invalid Operator");
    }
}

