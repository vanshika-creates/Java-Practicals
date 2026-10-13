abstract class Employee {
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double base = 40000;
    double calculateSalary() { return base + 10000; }
}

class PartTimeEmployee extends Employee {
    int hours = 20;
    double calculateSalary() { return hours * 500; }
}

public class Question29 {
    public static void main(String[] args) {
        Employee f = new FullTimeEmployee();
        Employee p = new PartTimeEmployee();
        System.out.println("FullTime Salary = " + f.calculateSalary());
        System.out.println("PartTime Salary = " + p.calculateSalary());
    }
}
