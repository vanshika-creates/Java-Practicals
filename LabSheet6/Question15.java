import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String msg) {
        super(msg);
    }
}

class InsufficientMedicineStockException extends Exception {
    InsufficientMedicineStockException(String msg) {
        super(msg);
    }
}

public class Question15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Medicine Name: ");
            String medicine = sc.nextLine();

            System.out.print("Available Quantity: ");
            int available = Integer.parseInt(sc.nextLine());

            System.out.print("Required Quantity: ");
            int required = Integer.parseInt(sc.nextLine());

            if(available < 0 || required < 0)
                throw new InvalidQuantityException("Invalid Quantity");

            if(required > available)
                throw new InsufficientMedicineStockException("Insufficient Stock");

            System.out.println("Medicine Issued");

        }

        catch(InvalidQuantityException e) {
            System.out.println(e.getMessage());
        }

        catch(InsufficientMedicineStockException e) {
            System.out.println(e.getMessage());
        }

        catch(Exception e) {
            System.out.println("Invalid Input");
        }

        finally {
            System.out.println("Inventory transaction completed");
        }
    }
}
