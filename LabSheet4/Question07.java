public class Question07 {
    int accountNumber;
    double balance;
    static String bankName = "SBI";

    Question07(int acc, double bal) {
        accountNumber = acc;
        balance = bal;
    }

    void deposit(double amount) {
        double newBalance = balance + amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + newBalance);
    }

    public static void main(String[] args) {
        Question07 acc1 = new Question07(12345, 5000);
        acc1.deposit(1500);
    }
}

