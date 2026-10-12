public class Question01 {

    String name;
    int age;

    static int count = 0;

    Question01(String n, int a) {
        name = n;
        age = a;
        count++; 
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        Question01 s1 = new Question01("Amit", 20);
        Question01 s2 = new Question01("Priya", 22);
        Question01 s3 = new Question01("Rahul", 19);

        s1.display();
        s2.display();
        s3.display();

        System.out.println("Total Students = " + Question01.count);
    }
}
