public class Question09 {

    static void method3() {
        int a = 10/0;
    }

    static void method2() {
        method3();
    }

    static void method1() {
        method2();
    }

    public static void main(String[] args) {

        try {
            method1();
        }

        catch(Exception e) {
            System.out.println("Handled in Main");
        }
    }
}
