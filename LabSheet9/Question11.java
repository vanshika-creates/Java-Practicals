import java.util.TreeSet;

public class Question11 {

    public static void main(String[] args) {

        TreeSet<Integer> ids = new TreeSet<>();

        ids.add(101);
        ids.add(102);
        ids.add(103);
        ids.add(101);
        ids.add(104);

        System.out.println(ids);

        System.out.println("First = " + ids.first());

        System.out.println("Last = " + ids.last());

        System.out.println("Higher(102) = " +
                ids.higher(102));

        System.out.println("Lower(102) = " +
                ids.lower(102));
    }
}
