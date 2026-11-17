import java.io.*;

public class Question05 {

    public static void main(String[] args) {

        try {

            FileReader fr =
                    new FileReader("source.txt");

            FileWriter fw =
                    new FileWriter("backup.txt");

            int ch;

            while((ch=fr.read())!=-1) {

                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File Copied");
        }

        catch(Exception e) {

            System.out.println(e);
        }
    }
}
