class Shared {

    int data;

    synchronized void produce(int value) {
        data=value;
        System.out.println("Produced : "+data);
    }

    synchronized void consume() {
        System.out.println("Consumed : "+data);
    }
}

public class Question13 {

    public static void main(String[] args) {

        Shared s = new Shared();

        s.produce(100);
        s.consume();
    }
}