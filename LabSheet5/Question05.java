class Person {
    String name; int age;
    Person(String n, int a) { name = n; age = a; }
    void displayPerson() { System.out.println("Name: " + name + ", Age: " + age); }
}
public class Question05 extends Person {
    int rollNo; String course;
    Question05(String n, int a, int r, String c) { super(n,a); rollNo=r; course=c; }
    void displayStudent() {
        displayPerson();
        System.out.println("RollNo: " + rollNo + ", Course: " + course);
    }
    public static void main(String[] args) {
        Question05 s = new Question05("Janvi", 20, 101, "BCA");
        s.displayStudent();
    }
}

