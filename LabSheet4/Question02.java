public class Question02 {
    int length, breadth;
    static String shapeName = "Rectangle";

    Question02(int l, int b) {
        length = l;
        breadth = b;
    }

    void area() {
        int area = length * breadth;
        System.out.println("Area of " + shapeName + " = " + area);
    }

    public static void main(String[] args) {
        Question02 r1 = new Question02(10, 5);
        r1.area();
    }
}
