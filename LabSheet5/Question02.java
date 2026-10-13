public class Question02 {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    public void setAccountNumber(int acc) { accountNumber = acc; }
    public void setAccountHolder(String holder) { accountHolder = holder; }
    public void setBalance(double bal) { balance = bal; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance = " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance = " + balance);
        } else {
            System.out.println("Invalid withdrawal!");
        }
    }

    public static void main(String[] args) {
        Question02 acc = new Question02();
        acc.setAccountNumber(12345);
        acc.setAccountHolder("Janvi");
        acc.setBalance(5000);

        acc.deposit(1000);
        acc.withdraw(2000);
        acc.withdraw(6000); 
    }
}

