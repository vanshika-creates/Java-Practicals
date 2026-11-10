class MyThread01 extends Thread {

    public void run() {
        for(int i=1;i<=5;i++) {
            System.out.println("Janvi");
        }
    }
}

public class Question01 {

    public static void main(String[] args) {

        MyThread01 t = new MyThread01();

        t.start();
    }
}
