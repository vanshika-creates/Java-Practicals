import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        int visitors = 0;

        System.out.println("Visitor enters (prefix): " + (++visitors));

        System.out.println("Visitor enters (postfix): " + (visitors++));
        System.out.println("Total visitors now: " + visitors);

        System.out.println("Visitor leaves (postfix): " + (visitors--));
        System.out.println("Visitor leaves (prefix): " + (--visitors));
        System.out.println("Final count: " + visitors);
    }
}

