import java.util.ArrayList;

public class Question14 {

    static <T> void displayList(ArrayList<T> list) {

        for(T item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(10);
        nums.add(20);
        nums.add(30);

        ArrayList<String> names = new ArrayList<>();

        names.add("Janvi");
        names.add("Riya");
        names.add("Aman");

        displayList(nums);

        displayList(names);
    }
}

