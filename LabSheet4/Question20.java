public class Question20 {
    double balance;
    static String bankCode = "SBI001";

    Question20(double b) {
        balance = b;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal: " + amount + ", Remaining Balance = " + balance);
        } else {
            System.out.println("Insufficient Balance! Bank Code: " + bankCode);
        }
    }

    public static void main(String[] args) {
        Question20 acc = new Question20(10000);
        acc.withdraw(3000);
        acc.withdraw(8000);
    }
}

