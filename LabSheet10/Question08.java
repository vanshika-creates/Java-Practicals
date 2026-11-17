import java.io.*;

public class Question08 {

*   public static void main(String[] args) {

        int vowels = 0;
*       int consonants = 0;
       *int digits = 0;
        int spaces = 0;

        try {

            FileReader fr =
                    new FileReader("input.txt");

            int ch;

            while((ch = fr.read()) != -1) {

                char c = (char) ch;

                if(Character.isDigit(c))
                    digits++;

                else if(c == ' ')
                    spaces++;

                else if("AEIOUaeiou".indexOf(c) != -1)
                    vowels++;

                else if(Character.isLetter(c))
                    consonants++;
            }

            fr.close();

            System.out.println("Vowels = " + vowels);
            System.out.println("Consonants = " + consonants);
            System.out.println("Digits = " + digits);
            System.out.println("Spaces = " + spaces);
        }

        catch(Exception e) {
            System.out.println(e);
        }
    }
}
