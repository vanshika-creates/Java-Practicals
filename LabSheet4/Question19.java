public class Question19 {
    int id;
    String name;
    double price;
    static double discountRate = 0.1; // 10%

    Question19(int i, String n, double p) {
        id = i; name = n; price = p;
    }

    void finalPrice() {
        double discount = price * discountRate;
        double finalPrice = price - discount;
        System.out.println("Product: " + name + ", Price: " + price + ", Final Price = " + finalPrice);
    }

    public static void main(String[] args) {
        Question19 p1 = new Question19(101, "Laptop", 50000);
        p1.finalPrice();
    }
}

