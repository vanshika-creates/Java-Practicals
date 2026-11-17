import javax.swing.*;

public class Question08 {

    public static void main(String[] args) {

        JFrame f = new JFrame("Notepad");

        JTextArea area =
                new JTextArea();

        JMenuBar mb =
                new JMenuBar();

        JMenu file =
                new JMenu("File");

        JMenuItem clear =
                new JMenuItem("New");

        clear.addActionListener(e ->
                area.setText(""));

        file.add(clear);

        mb.add(file);

        f.setJMenuBar(mb);

        f.add(area);

        f.setSize(400,400);
        f.setVisible(true);
    }
}
