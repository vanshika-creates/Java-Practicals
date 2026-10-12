public class Question09 {
    String brand;
    int RAM;
    static String os = "Windows";

    Question09(String b, int r) {
        brand = b;
        RAM = r;
    }

    void display() {
        System.out.println("Brand: " + brand + ", RAM: " + RAM + "GB, OS: " + os);
    }

    public static void main(String[] args) {
        Question09 l1 = new Question09("Dell", 16);
        l1.display();
    }
}
