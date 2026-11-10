class MyThread06 extends Thread {

    public void run() {
        System.out.println("Thread Running...");
    }
}

public class Question06 {

    public static void main(String[] args) {

        MyThread06 t = new MyThread06();

        System.out.println(t.isAlive());

        t.start();

        try {
            t.join();
        }
        catch(Exception e) {}

        System.out.println(t.isAlive());
    }
}
