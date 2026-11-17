import java.util.ArrayList;
import java.util.ListIterator;

public class Question13 {

    public static void main(String[] args) {

        ArrayList<String> courses =
                new ArrayList<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("DBMS");
        courses.add("OS");

        ListIterator<String> it =
                courses.listIterator();

        System.out.println("Forward");

        while(it.hasNext()) {

            System.out.println(
                    it.nextIndex() +
                    " " +
                    it.next());
        }

        System.out.println("Backward");

        while(it.hasPrevious()) {

            System.out.println(
                    it.previousIndex() +
                    " " +
                    it.previous());
        }
    }
}
