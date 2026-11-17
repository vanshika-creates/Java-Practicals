import javax.swing.*;

public class Question10 {

    static double balance = 10000;

    public static void main(String[] args) {

        String amt =
                JOptionPane.showInputDialog(
                        "Enter Amount");

        double amount =
                Double.parseDouble(amt);

        balance += amount;

        JOptionPane.showMessageDialog(
                null,
                "Balance = "
                + balance);
    }
}
