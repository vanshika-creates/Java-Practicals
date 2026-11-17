import java.io.*;
import java.util.Scanner;

public class Question10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            FileWriter fw =
                    new FileWriter("employees.txt");

            fw.write("101 Janvi IT 50000\n");
            fw.write("102 Rahul HR 40000\n");

            fw.close();

            System.out.print("Enter Employee ID : ");

            String id = sc.nextLine();

            BufferedReader br =
                    new BufferedReader(
                    new FileReader("employees.txt"));

            String line;
            boolean found = false;

            while((line = br.readLine()) != null) {

                if(line.startsWith(id)) {

                    System.out.println(line);

                    found = true;
                }
            }

            if(!found)
                System.out.println("Employee record not found");

            br.close();
        }

        catch(Exception e) {

            System.out.println("File Not Found");
        }
    }
}
