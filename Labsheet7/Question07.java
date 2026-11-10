class MyThread07 extends Thread {

    public void run() {

        long sum = 0;

        for(int i=1;i<=10000;i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
    }
}

public class Question07 {

    public static void main(String[] args) throws Exception {

        MyThread07 t = new MyThread07();

        t.start();

        t.join();

        System.out.println("Completed");
    }
}

