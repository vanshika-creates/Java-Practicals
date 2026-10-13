class Person {
    String name;
    Person(String n) { name = n; }
    void displayName() { System.out.println("Name: " + name); }
}
class Employee extends Person {
    int employeeId;
    Employee(String n, int id) { super(n); employeeId = id; }
    void displayEmployee() { System.out.println("Employee ID: " + employeeId); }
}
public class Question08 extends Employee {
    String department;
    Question08(String n, int id, String d) { super(n,id); department = d; }
    void displayManager() {
        displayName(); displayEmployee();
        System.out.println("Department: " + department);
    }
    public static void main(String[] args) {
        Question08 m = new Question08("Janvi", 101, "IT");
        m.displayManager();
    }
}

