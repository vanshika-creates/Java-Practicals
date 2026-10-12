public class Question16 {
    int a, b, c;
    static String type;

    Question16(int x, int y, int z) {
        a = x; b = y; c = z;
    }

    void checkValidity() {
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) type = "Equilateral";
            else if (a == b || b == c || a == c) type = "Isosceles";
            else type = "Scalene";
            System.out.println("Valid Triangle: " + type);
        } else {
            System.out.println("Not a valid triangle");
        }
    }

    public static void main(String[] args) {
        Question16 t1 = new Question16(5, 5, 5);
        t1.checkValidity();
    }
}

