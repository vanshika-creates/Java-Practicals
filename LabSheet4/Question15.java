public class Question15 {
    double principal, rate, time;
    static String bank = "SBI";

    Question15(double p, double r, double t) {
        principal = p;
        rate = r;
        time = t;
    }

    void calculateInterest() {
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + interest + ", Bank = " + bank);
    }

    public static void main(String[] args) {
        Question15 si = new Question15(10000, 5, 2);
        si.calculateInterest();
    }
}

