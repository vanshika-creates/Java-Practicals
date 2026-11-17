import java.awt.*;
import java.awt.event.*;

public class Question01 extends Frame implements ActionListener {

    TextField name, roll, course;
    Button submit, reset;

    Question01() {

        setLayout(new FlowLayout());

        add(new Label("Name"));
        name = new TextField(20);
        add(name);

        add(new Label("Roll"));
        roll = new TextField(20);
        add(roll);

        add(new Label("Course"));
        course = new TextField(20);
        add(course);

        submit = new Button("Submit");
        reset = new Button("Reset");

        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setSize(300,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==submit) {

            System.out.println(
                name.getText()+" "
                +roll.getText()+" "
                +course.getText());
        }

        if(e.getSource()==reset) {

            name.setText("");
            roll.setText("");
            course.setText("");
        }
    }

    public static void main(String[] args) {
        new Question01();
    }
}
