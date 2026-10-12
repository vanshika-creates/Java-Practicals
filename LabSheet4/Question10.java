public class Question10 {
    String name, genre;
    double rating;
    static String industry = "Bollywood";

    Question10(String n, String g, double r) {
        name = n;
        genre = g;
        rating = r;
    }

    void display() {
        System.out.println("Movie: " + name + ", Genre: " + genre + ", Rating: " + rating + ", Industry: " + industry);
    }

    public static void main(String[] args) {
        Question10 m1 = new Question10("Sholay", "Action", 9.5);
        m1.display();
    }
}

