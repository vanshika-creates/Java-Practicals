import java.util.Scanner;

public class Question06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            if(marks < 0 || marks > 100) {
                throw new ArithmeticException("Invalid Marks");
            }

            System.out.println("Marks = " + marks);
        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
