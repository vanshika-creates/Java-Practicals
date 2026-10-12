public class Question05 {
    String title, author;
    double price;
    static String publisher = "Penguin";

    Question05(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Publisher: " + publisher);
    }

    public static void main(String[] args) {
        Question05 b1 = new Question05("Java Basics", "James Gosling", 450);
        b1.display();
    }
}

