import java.util.Scanner;

class InvalidDosageException extends Exception {
    InvalidDosageException(String msg) {
        super(msg);
    }
}

public class Question13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Patient Name: ");
            String patient = sc.nextLine();

            System.out.print("Drug Name: ");
            String drug = sc.nextLine();

            System.out.print("Dosage: ");
            int dosage = Integer.parseInt(sc.nextLine());

            if(dosage <= 0 || dosage > 1000)
                throw new InvalidDosageException("Invalid Dosage");

            System.out.println("Dosage Valid");

        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Dosage validation completed");
        }
    }
}
