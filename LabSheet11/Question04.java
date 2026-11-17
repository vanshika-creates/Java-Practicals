import javax.swing.*;

public class Question04 {

    public static void main(String[] args) {

        String m1 =
                JOptionPane.showInputDialog("English");

        String m2 =
                JOptionPane.showInputDialog("Math");

        int total =
                Integer.parseInt(m1)
                +
                Integer.parseInt(m2);

        double per = total/2.0;

        JOptionPane.showMessageDialog(
                null,
                "Total="+total+
                "\nPercentage="+per);
    }
}
