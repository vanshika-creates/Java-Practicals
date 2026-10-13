class Employee {
    private String name; private double salary;
    public void setName(String n) { name = n; }
    public void setSalary(double s) { salary = s; }
    public String getName() { return name; }
    public double getSalary() { return salary; }
}
public class Question06 extends Employee {
    String department;
    Question06(String n, double s, String d) {
        setName(n); setSalary(s); department = d;
    }
    void displayManager() {
        System.out.println("Name: " + getName() + ", Salary: " + getSalary() + ", Dept: " + department);
    }
    public static void main(String[] args) {
        Question06 m = new Question06("Amit", 60000, "IT");
        m.displayManager();
    }
}

