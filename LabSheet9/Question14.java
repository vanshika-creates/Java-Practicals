import java.util.ArrayList;
import java.util.LinkedList;

public class Question14 {

    public static void main(String[] args) {

        ArrayList<String> arr =
                new ArrayList<>();

        LinkedList<String> list =
                new LinkedList<>();

        arr.add("Java");
        arr.add("Python");

        list.add("Java");
        list.add("Python");

        arr.remove(0);
        list.remove(0);

        System.out.println(arr);

        System.out.println(list);

        System.out.println(
                "ArrayList Size = " +
                arr.size());

        System.out.println(
                "LinkedList Size = " +
                list.size());
    }
}
