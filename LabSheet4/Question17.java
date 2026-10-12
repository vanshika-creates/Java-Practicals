public class Question17 {
    String name;
    int marks;
    static int passingMarks = 40;

    Question17(String n, int m) {
        name = n;
        marks = m;
    }

    void assignGrade() {
        String grade;
        if (marks >= 90) grade = "A";
        else if (marks >= 75) grade = "B";
        else if (marks >= passingMarks) grade = "C";
        else grade = "Fail";

        System.out.println(name + " scored " + marks + " → Grade: " + grade);
    }

    public static void main(String[] args) {
        Question17 s1 = new Question17("Amit", 85);
        s1.assignGrade();
    }
}

