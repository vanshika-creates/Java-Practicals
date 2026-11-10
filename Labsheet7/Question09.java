class MyThread09 extends Thread {

    MyThread09(String name,int p) {

        super(name);
        setPriority(p);
    }

    public void run() {

        System.out.println(getName() +
                " Priority = " +
                getPriority());
    }
}

public class Question09 {

    public static void main(String[] args) {

        for(int i=1;i<=9;i+=2) {

            new MyThread09("T"+i,i).start();
        }
    }
}
