import java.util.ArrayList;

public class Question10 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Janvi");
        names.add("Aman");
        names.add("Riya");
        names.add("Rahul");
        names.add("Priya");

        System.out.println(names);

        System.out.println(names.get(1));

        names.set(1, "Ankit");

        names.remove(2);

        System.out.println("Size = " + names.size());

        System.out.println(names);
    }
}