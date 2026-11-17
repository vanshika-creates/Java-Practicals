import java.util.ArrayList;

public class Question03 {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("A");
        students.add("B");
        students.add("C");
        students.add("D");

        students.set(1,"Janvi");
        students.remove(3);

        System.out.println(students);
    }
}