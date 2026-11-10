class MyThread08 extends Thread {

    MyThread08(String name) {
        super(name);
    }

    public void run() {
        System.out.println(getName());
    }
}

public class Question08 {

    public static void main(String[] args) {

        MyThread08 t1 = new MyThread08("High");
        MyThread08 t2 = new MyThread08("Low");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }
}
