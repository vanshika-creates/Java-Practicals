class Person {
    String name;
    Person(String n) { name = n; }
    void displayName() { System.out.println("Name: " + name); }
}

class Student extends Person {
    String course;
    Student(String n, String c) { super(n); course = c; }
    void study() { System.out.println(name + " studies " + course); }
}

class Teacher extends Person {
    String subject;
    Teacher(String n, String s) { super(n); subject = s; }
    void teach() { System.out.println(name + " teaches " + subject); }
}

public class Question11 {
    public static void main(String[] args) {
        Student s = new Student("Janvi", "BCA");
        Teacher t = new Teacher("Amit", "Java");

        s.displayName();
        s.study();
        t.displayName();
        t.teach();
    }
}
