public class Question04 {
    int empId;
    double salary;
    static String companyName = "Infosys";

    Question04(int id, double sal) {
        empId = id;
        salary = sal;
    }

    void display() {
        System.out.println("EmpID: " + empId + ", Salary: " + salary + ", Company: " + companyName);
    }

    public static void main(String[] args) {
        Question04 e1 = new Question04(101, 50000);
        e1.display();
    }
}

