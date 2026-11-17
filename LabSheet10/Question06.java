import java.io.*;
import java.util.Scanner;

public class Question06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Word : ");
        String word = sc.nextLine();

        int count = 0;

        try {

            BufferedReader br =
                    new BufferedReader(
                    new FileReader("notes.txt"));

            String line;

            while((line = br.readLine()) != null) {

                String arr[] = line.split(" ");

                for(String s : arr) {

                    if(s.equalsIgnoreCase(word))
                        count++;
                }
            }

            br.close();

            if(count > 0)
                System.out.println("Found " + count + " times");
            else
                System.out.println("Word Not Found");
        }

        catch(Exception e) {
            System.out.println(e);
        }
    }
}
