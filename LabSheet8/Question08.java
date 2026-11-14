public class Question08 {

    static <T> void show(T a,T b,T c) {

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {

        show(1,2,3);

        show("A","B","C");

        show(1.1,2.2,3.3);
    }
}