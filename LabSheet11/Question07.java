import javax.swing.*;

public class Question07 {

    public static void main(String[] args) {

        String c =
                JOptionPane.showInputDialog(
                        "Enter Celsius");

        double cel =
                Double.parseDouble(c);

        double f =
                (cel * 9/5) + 32;

        JOptionPane.showMessageDialog(
                null,
                "Fahrenheit = " + f);
    }
}
