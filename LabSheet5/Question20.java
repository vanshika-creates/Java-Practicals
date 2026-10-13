class Employee {
    private int employeeId; private String employeeName; private double salary;
    Employee(int id, String name, double sal) { employeeId=id; employeeName=name; salary=sal; }
    void displayDetails() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName + ", Salary: " + salary);
    }
    double calculateSalary() { return salary; }
}

interface Researcher { void conductResearch(); }

class Teacher extends Employee implements Researcher {
    String subject;
    Teacher(int id, String name, double sal, String sub) { super(id,name,sal); subject=sub; }
    void teach() { System.out.println("Teaching " + subject); }
    @Override public void conductResearch() { System.out.println("Researching in " + subject); }
    @Override double calculateSalary() { return super.calculateSalary() + 5000; }
}

class VisitingTeacher extends Teacher {
    int hoursWorked;
    VisitingTeacher(int id, String name, double sal, String sub, int hrs) {
        super(id,name,sal,sub); hoursWorked=hrs;
    }
    @Override double calculateSalary() { return hoursWorked * 500; }
}

class Admin extends Employee {
    String department;
    Admin(int id, String name, double sal, String dept) { super(id,name,sal); department=dept; }
    void manageDepartment() { System.out.println("Managing " + department + " department"); }
}

public class Question20 {
    public static void main(String[] args) {
        Teacher t = new Teacher(101,"Amit",40000,"Java");
        VisitingTeacher vt = new VisitingTeacher(102,"Priya",0,"Python",20);
        Admin a = new Admin(103,"Rahul",50000,"HR");

        t.displayDetails(); t.teach(); t.conductResearch();
        System.out.println("Teacher Salary = " + t.calculateSalary());

        vt.displayDetails(); vt.teach();
        System.out.println("VisitingTeacher Salary = " + vt.calculateSalary());

        a.displayDetails(); a.manageDepartment();
        System.out.println("Admin Salary = " + a.calculateSalary());
    }
}

