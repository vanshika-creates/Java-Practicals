class Shared15 {

    int value;

    synchronized void setValue(int value) {

        this.value = value;

        notify();
    }

    synchronized void getValue() {

        try {

            wait();

            System.out.println("Value = " + value);
        }

        catch(Exception e){}
    }
}

public class Question15 {

    public static void main(String[] args) {

        Shared15 s = new Shared15();

        new Thread(() -> s.getValue()).start();

        new Thread(() -> s.setValue(50)).start();
    }
}
