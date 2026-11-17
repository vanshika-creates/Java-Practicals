import java.util.LinkedList;

public class Question08 {

    public static void main(String[] args) {

        LinkedList<String> students =
                new LinkedList<>();

        students.addFirst("A");
        students.addLast("B");
        students.addLast("C");

        System.out.println(students);

        students.removeFirst();
        students.removeLast();

        System.out.println(students);
    }
}
