import javax.swing.*;

public class Question09 {

    public static void main(String[] args) {

        String name =
                JOptionPane.showInputDialog(
                        "Student Name");

        String comment =
                JOptionPane.showInputDialog(
                        "Feedback");

        JOptionPane.showMessageDialog(
                null,
                "Name : "
                + name
                + "\nFeedback : "
                + comment);
    }
}
