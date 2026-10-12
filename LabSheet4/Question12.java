public class Question12 {
    int marks1, marks2, marks3;
    static String universityName = "COER University";

    Question12(int m1, int m2, int m3) {
        marks1 = m1;
        marks2 = m2;
        marks3 = m3;
    }

    void average() {
        double avg = (marks1 + marks2 + marks3) / 3.0; 
        System.out.println("Average Marks = " + avg + ", University = " + universityName);
    }

    public static void main(String[] args) {
        Question12 s1 = new Question12(80, 75, 90);
        s1.average();
    }
}

