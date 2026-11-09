import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class Question11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter Balance: ");
            double balance = Double.parseDouble(sc.next());

            System.out.print("Enter Amount: ");
            double amount = Double.parseDouble(sc.next());

            if(amount < 0)
                throw new Exception("Negative Amount Not Allowed");

            if(amount > balance)
                throw new InsufficientBalanceException("Insufficient Balance");

            balance -= amount;

            System.out.println("Remaining Balance = " + balance);
        }

        catch(Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Bank transaction completed");
        }
    }
}