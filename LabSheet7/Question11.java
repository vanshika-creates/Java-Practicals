class Table {

    synchronized void printTable(int n) {

        for(int i=1;i<=5;i++) {
            System.out.println(n*i);
        }
    }
}

class MyThread11 extends Thread {

    Table t;
    int num;

    MyThread11(Table t,int num) {
        this.t=t;
        this.num=num;
    }

    public void run() {
        t.printTable(num);
    }
}

public class Question11 {

    public static void main(String[] args) {

        Table obj = new Table();

        MyThread11 t1 = new MyThread11(obj,5);
        MyThread11 t2 = new MyThread11(obj,10);

        t1.start();
        t2.start();
    }
}