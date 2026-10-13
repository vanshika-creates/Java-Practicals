interface Bank {
    double rateOfInterest();
}

class SBI implements Bank {
    public double rateOfInterest() { return 7.0; }
}

class PNB implements Bank {
    public double rateOfInterest() { return 6.5; }
}

public class Question25 {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        Bank b2 = new PNB();
        System.out.println("SBI ROI = " + b1.rateOfInterest() + "%");
        System.out.println("PNB ROI = " + b2.rateOfInterest() + "%");
    }
}

