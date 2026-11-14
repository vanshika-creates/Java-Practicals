class MyThread05 extends Thread {

    String msg;

    MyThread05(String name,String msg) {

        super(name);
        this.msg = msg;
    }

    public void run() {

        System.out.println(getName() + " : " + msg);
    }
}

public class Question05 {

    public static void main(String[] args) {

        MyThread05 t1 = new MyThread05("Reader","Reading");
        MyThread05 t2 = new MyThread05("Writer","Writing");

        t1.start();
        t2.start();
    }
}