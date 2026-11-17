import java.io.*;

public class Question02 {

    public static void main(String[] args) {

        try {

            BufferedReader br =
                    new BufferedReader(
                    new FileReader("student.txt"));

            String line;

            while((line=br.readLine())!=null) {

                System.out.println(line);
            }

            br.close();
        }

        catch(Exception e) {

            System.out.println("File Not Found");
        }
    }
}
