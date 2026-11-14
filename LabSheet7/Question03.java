public class Question03 {

    public static void main(String[] args) {

        Thread t = Thread.currentThread();

        System.out.println("Current Thread Name : " + t.getName());

        t.setName("MainThread");

        System.out.println("New Thread Name : " + t.getName());
    }
}