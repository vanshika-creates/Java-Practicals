public class Question06 {
    String brand;
    double mileage;
    static int wheels = 4;

    Question06(String b, double m) {
        brand = b;
        mileage = m;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Mileage: " + mileage + ", Wheels: " + wheels);
    }

    public static void main(String[] args) {
        Question06 c1 = new Question06("Honda", 18.5);
        c1.display();
    }
}

