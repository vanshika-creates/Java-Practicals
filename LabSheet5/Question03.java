public class Question03 {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setEmployeeId(int id) { employeeId = id; }
    public void setEmployeeName(String name) { employeeName = name; }
    public void setSalary(double sal) {
        if (sal >= 0 && sal <= 1000000) salary = sal;
        else System.out.println("Invalid salary!");
    }

    public void displayEmployee() {
        System.out.println("ID: " + employeeId + ", Name: " + employeeName + ", Salary: " + salary);
    }

    public static void main(String[] args) {
        Question03 e1 = new Question03();
        e1.setEmployeeId(101);
        e1.setEmployeeName("Amit");
        e1.setSalary(50000); // valid
        e1.displayEmployee();

        Question03 e2 = new Question03();
        e2.setEmployeeId(102);
        e2.setEmployeeName("Priya");
        e2.setSalary(2000000); // invalid
        e2.displayEmployee();
    }
}

