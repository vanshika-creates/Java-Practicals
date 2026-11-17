import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Question15 {

    public static void main(String[] args) {

        ArrayList<String> students =
                new ArrayList<>();

        HashSet<Integer> uniqueIds =
                new HashSet<>();

        TreeSet<Integer> sortedIds =
                new TreeSet<>();

        students.add("Janvi");
        students.add("Aman");
        students.add("Riya");
        students.add("Rahul");
        students.add("Priya");

        uniqueIds.add(101);
        uniqueIds.add(102);
        uniqueIds.add(103);
        uniqueIds.add(101);

        sortedIds.addAll(uniqueIds);

        System.out.println("Students");

        for(String s : students) {
            System.out.println(s);
        }

        System.out.println(
                "Total Students = " +
                students.size());

        System.out.println(
                "Contains Janvi = " +
                students.contains("Janvi"));

        System.out.println(
                "Unique IDs = " +
                uniqueIds);

        System.out.println(
                "Sorted IDs = " +
                sortedIds);
    }
}
