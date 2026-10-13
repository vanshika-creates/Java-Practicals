class Employee {
    double baseSalary = 30000;
    double calculateSalary() { return baseSalary; }
}

class Manager extends Employee {
    @Override double calculateSalary() { return baseSalary + 20000; }
}

public class Question14 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();
        System.out.println("Employee Salary = " + e.calculateSalary());
        System.out.println("Manager Salary = " + m.calculateSalary());
    }
}
