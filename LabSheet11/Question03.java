import javax.swing.*;
import java.awt.event.*;

public class Question03 {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JTextField user = new JTextField();
        JPasswordField pass =
                new JPasswordField();

        JButton login =
                new JButton("Login");

        user.setBounds(50,50,100,30);
        pass.setBounds(50,100,100,30);
        login.setBounds(50,150,100,30);

        login.addActionListener(e -> {

            if(user.getText().equals("admin")
                    &&
               String.valueOf(pass.getPassword())
                       .equals("123"))
            {
                JOptionPane.showMessageDialog(
                        f,"Login Success");
            }
            else
            {
                JOptionPane.showMessageDialog(
                        f,"Login Failed");
            }
        });

        f.add(user);
        f.add(pass);
        f.add(login);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
