import java.io.FileWriter;
import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            FileWriter fw =
                    new FileWriter(
                    "students.txt",true);

            System.out.print("Name : ");
            String name = sc.nextLine();

            System.out.print("Roll : ");
            String roll = sc.nextLine();

            System.out.print("Marks : ");
            String marks = sc.nextLine();

            fw.write(name + " "
                    + roll + " "
                    + marks + "\n");

            fw.close();

            System.out.println("Record Added");
        }

        catch(Exception e) {

            System.out.println(e);
        }
    }
}