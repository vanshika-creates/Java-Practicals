import java.util.Scanner;

class InvalidPatientAgeException extends Exception {
    InvalidPatientAgeException(String msg) {
        super(msg);
    }
}

public class Question12 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = Integer.parseInt(sc.nextLine());

            if(age < 0 || age > 120)
                throw new InvalidPatientAgeException("Invalid Age");

            System.out.println("Patient Registered");

        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
