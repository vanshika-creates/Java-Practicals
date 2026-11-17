import java.util.*;

public class Question09 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");

        ListIterator<String> it =
                list.listIterator();

        while(it.hasNext()) {

            String s = it.next();

            if(s.equals("Java"))
                it.set("JAVA");

            if(s.equals("Python"))
                it.add("C++");
        }

        System.out.println(list);
    }
}
