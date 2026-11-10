class MyThread02 implements Runnable {

    public void run() {

        for(int i=1;i<=5;i++) {

            System.out.println("Hello");
        }
    }
}

public class Question02 {

    public static void main(String[] args) {

        Thread t = new Thread(new MyThread02());

        t.start();
    }
}
