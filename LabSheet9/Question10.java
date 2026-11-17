import java.util.*;

public class Question10 {

    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>();

        HashSet<Integer> set =
                new HashSet<>();

        int arr[] = {1,2,2,3,4,4};

        for(int x : arr) {

            list.add(x);
            set.add(x);
        }

        System.out.println("ArrayList = " + list);

        System.out.println("HashSet = " + set);
    }
}
