public class Question29 {
    String name;
    double salary;
    static String organization = "COER";

    Question29(String n, double s) {
        name = n;
        salary = s;
    }

    static void compare(Question29 e1, Question29 e2) {
        if (e1.salary > e2.salary)
            System.out.println(e1.name + " has higher salary than " + e2.name);
        else if (e1.salary < e2.salary)
            System.out.println(e2.name + " has higher salary than " + e1.name);
        else
            System.out.println("Both have equal salary");
    }

    public static void main(String[] args) {
        Question29 emp1 = new Question29("Amit", 50000);
        Question29 emp2 = new Question29("Priya", 60000);
        compare(emp1, emp2);
    }
}
