import java.awt.*;
import java.awt.event.*;

public class Question02 extends Frame implements ActionListener {

    TextField t1,t2,result;
    Button add;

    Question02() {

        setLayout(new FlowLayout());

        t1=new TextField(10);
        t2=new TextField(10);
        result=new TextField(10);

        add=new Button("Add");

        add(t1);
        add(t2);
        add(add);
        add(result);

        add.addActionListener(this);

        setSize(300,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int a=Integer.parseInt(t1.getText());
        int b=Integer.parseInt(t2.getText());

        result.setText(""+(a+b));
    }

    public static void main(String[] args) {
        new Question02();
    }
}
