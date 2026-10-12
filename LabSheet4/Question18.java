public class Question18 {
    int units;
    static double fixedCharge = 50;

    Question18(int u) {
        units = u;
    }

    void calculateBill() {
        double bill;
        if (units <= 100) bill = units * 5;
        else if (units <= 200) bill = (100 * 5) + (units - 100) * 7;
        else bill = (100 * 5) + (100 * 7) + (units - 200) * 10;

        double total = bill + fixedCharge;
        System.out.println("Units: " + units + ", Total Bill = " + total);
    }

    public static void main(String[] args) {
        Question18 eb = new Question18(250);
        eb.calculateBill();
    }
}

