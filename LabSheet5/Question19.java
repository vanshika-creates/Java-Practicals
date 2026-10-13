class Employee {
    private String name; private int employeeId;
    Employee(String n, int id) { name = n; employeeId = id; }
    void displayEmployee() {
        System.out.println("Name: " + name + ", ID: " + employeeId);
    }
}

interface Programmer { void writeCode(); }
interface Researcher { void conductResearch(); }

public class Question19 extends Employee implements Programmer, Researcher {
    Question19(String n, int id) { super(n,id); }
    public void writeCode() { System.out.println("Writing code..."); }
    public void conductResearch() { System.out.println("Conducting research..."); }

    public static void main(String[] args) {
        Question19 dev = new Question19("Janvi", 101);
        dev.displayEmployee();
        dev.writeCode();
        dev.conductResearch();
    }
}
