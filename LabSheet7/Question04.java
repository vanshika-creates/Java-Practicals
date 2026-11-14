class MyThread04 extends Thread {

    MyThread04(String name) {
        super(name);
    }

    public void run() {

        for(int i=1;i<=5;i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}

public class Question04 {

    public static void main(String[] args) {

        MyThread04 t1 = new MyThread04("Thread1");
        MyThread04 t2 = new MyThread04("Thread2");

        t1.start();
        t2.start();
    }
}
