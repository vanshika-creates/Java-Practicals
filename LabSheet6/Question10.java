import java.util.Scanner;

class InvalidMarksException extends Exception {

    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class Question10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            if(marks < 0 || marks > 100) {
                throw new InvalidMarksException("Invalid Marks");
            }

            System.out.println("Valid Marks");

        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}