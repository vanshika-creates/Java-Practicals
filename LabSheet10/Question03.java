import java.io.*;

public class Question03 {

    public static void main(String[] args) {

        int lines = 0;
        int words = 0;
        int chars = 0;

        try {

            BufferedReader br =
                    new BufferedReader(
                    new FileReader("data.txt"));

            String line;

            while((line=br.readLine())!=null) {

                lines++;

                chars += line.length();

                words += line.split("\\s+").length;
            }

            br.close();

            System.out.println("Lines = " + lines);
            System.out.println("Words = " + words);
            System.out.println("Characters = " + chars);
        }

        catch(Exception e) {

            System.out.println(e);
        }
    }
}
