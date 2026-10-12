public class Question08 {
    String color, type;
    static String manufacturer = "Cello";

    Question08(String c, String t) {
        color = c;
        type = t;
    }

    void display() {
        System.out.println("Color: " + color + ", Type: " + type + ", Manufacturer: " + manufacturer);
    }

    public static void main(String[] args) {
        Question08 p1 = new Question08("Blue", "Gel");
        p1.display();
    }
}

