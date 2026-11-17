import java.util.ArrayList;

public class Question02 {

    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(80);
        marks.add(70);
        marks.add(90);
        marks.add(60);
        marks.add(85);

        System.out.println("First = " + marks.get(0));
        System.out.println("Middle = " + marks.get(2));
        System.out.println("Last = " + marks.get(4));
    }
}
