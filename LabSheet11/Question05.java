import javax.swing.*;

public class Question05 {

    public static void main(String[] args) {

        JFrame f = new JFrame();

        JTextField name = new JTextField();

        String courses[]={"BCA","MCA","MBA"};

        JComboBox<String> cb =
                new JComboBox<>(courses);

        JButton btn =
                new JButton("Submit");

        name.setBounds(50,50,150,30);
        cb.setBounds(50,100,150,30);
        btn.setBounds(50,150,100,30);

        btn.addActionListener(e->{

            JOptionPane.showMessageDialog(
                    f,
                    "Name : "
                    + name.getText()
                    + "\nCourse : "
                    + cb.getSelectedItem());
        });

        f.add(name);
        f.add(cb);
        f.add(btn);

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}
