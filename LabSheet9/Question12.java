import java.util.ArrayList;
import java.util.HashSet;

public class Question12 {

    public static void main(String[] args) {

        ArrayList<String> patients =
                new ArrayList<>();

        HashSet<String> ids =
                new HashSet<>();

        patients.add("Aman");
        patients.add("Janvi");
        patients.add("Riya");

        ids.add("P101");
        ids.add("P102");
        ids.add("P103");

        System.out.println(patients);

        patients.remove("Riya");

        System.out.println(
                patients.contains("Janvi"));

        System.out.println(ids);
    }
}
