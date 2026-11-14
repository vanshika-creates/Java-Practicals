class BankAccount {

    int balance = 10000;

    void withdraw(int amount) {

        balance = balance - amount;
    }
}

class User10 extends Thread {

    BankAccount acc;

    User10(BankAccount acc) {
        this.acc = acc;
    }

    public void run() {

        for(int i=0;i<1000;i++) {
            acc.withdraw(1);
        }
    }
}

public class Question10 {

    public static void main(String[] args) throws Exception {

        BankAccount acc = new BankAccount();

        User10 u1 = new User10(acc);
        User10 u2 = new User10(acc);

        u1.start();
        u2.start();

        u1.join();
        u2.join();

        System.out.println("Balance = " + acc.balance);
    }
}
