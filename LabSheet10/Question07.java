import java.io.File;
import java.util.Scanner;

public class Question07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter File Name : ");

        String name = sc.nextLine();

        File f = new File(name);

        System.out.println("Exists : " + f.exists());
        System.out.println("Name : " + f.getName());
        System.out.println("Path : " + f.getAbsolutePath());
        System.out.println("Size : " + f.length());

        System.out.println("Is File : " + f.isFile());
        System.out.println("Is Directory : " + f.isDirectory());

        System.out.println("Readable : " + f.canRead());
        System.out.println("Writable : " + f.canWrite());
    }
}
