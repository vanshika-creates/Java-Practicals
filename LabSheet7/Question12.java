class Display {

    void show(String msg) {

        synchronized(this) {

            for(int i=1;i<=3;i++) {
                System.out.println(msg);
            }
        }
    }
}

class MyThread12 extends Thread {

    Display d;
    String msg;

    MyThread12(Display d,String msg) {
        this.d=d;
        this.msg=msg;
    }

    public void run() {
        d.show(msg);
    }
}

public class Question12 {

    public static void main(String[] args) {

        Display d = new Display();

        new MyThread12(d,"Hello").start();
        new MyThread12(d,"Java").start();
    }
}