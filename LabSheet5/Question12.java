class Employee {
    String name; int id;
    Employee(String n, int i) { name = n; id = i; }
    void displayEmployee() { System.out.println("Name: " + name + ", ID: " + id); }
}
class Developer extends Employee {
    String language;
    Developer(String n, int i, String l) { super(n,i); language = l; }
    void writeCode() { System.out.println(name + " codes in " + language); }
}
class Manager extends Employee {
    String dept;
    Manager(String n, int i, String d) { super(n,i); dept = d; }
    void conductMeeting() { System.out.println(name + " manages " + dept + " dept"); }
}
public class Question12 {
    public static void main(String[] args) {
        Developer d = new Developer("Rahul", 101, "Java");
        Manager m = new Manager("Priya", 102, "HR");
        d.displayEmployee(); d.writeCode();
        m.displayEmployee(); m.conductMeeting();
    }
}

