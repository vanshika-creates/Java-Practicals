import java.util.ArrayList;

public class Question01 {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("A");
        students.add("B");
        students.add("C");
        students.add("D");
        students.add("E");
        students.add("F");
        students.add("G");
        students.add("H");
        students.add("I");
        students.add("J");

        for(String s : students) {
            System.out.println(s);
        }

        System.out.println("Size = " + students.size());
    }
}
