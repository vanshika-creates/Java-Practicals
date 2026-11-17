import java.awt.*;
import java.awt.event.*;

public class Question06 extends Frame
        implements ActionListener {

    TextField id,name,salary;
    TextArea area;
    Button submit;

    Question06() {

        setLayout(new FlowLayout());

        id = new TextField(20);
        name = new TextField(20);
        salary = new TextField(20);

        area = new TextArea(5,20);

        submit = new Button("Submit");

        add(id);
        add(name);
        add(salary);
        add(submit);
        add(area);

        submit.addActionListener(this);

        setSize(300,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        area.setText(
                "ID : "
                + id.getText()
                + "\nName : "
                + name.getText()
                + "\nSalary : "
                + salary.getText());
    }

    public static void main(String[] args) {
        new Question06();
    }
}
