import java.io.*;
import java.util.Scanner;

public class Question09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            FileWriter fw =
                    new FileWriter("student_records.txt");

            for(int i=1;i<=5;i++) {

                System.out.print("Roll : ");
                String roll = sc.nextLine();

                System.out.print("Name : ");
                String name = sc.nextLine();

                System.out.print("Course : ");
                String course = sc.nextLine();

                System.out.print("Marks : ");
                String marks = sc.nextLine();

                fw.write(roll + " "
                        + name + " "
                        + course + " "
                        + marks + "\n");
            }

            fw.close();

            BufferedReader br =
                    new BufferedReader(
                    new FileReader("student_records.txt"));

            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }

        catch(Exception e) {
            System.out.println(e);
        }
    }
}
