import java.util.ArrayList;
import java.util.Scanner;

public class Question06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> courses = new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");

        System.out.print("Enter Course : ");
        String c = sc.nextLine();

        if(courses.contains(c))
            System.out.println("Course Found");
        else
            System.out.println("Course Not Found");
    }
}
