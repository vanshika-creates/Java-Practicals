public class Question01 {
    private String name;
    private int rollNo;
    private double marks;

    public String getName() { return name; }
    public int getRollNo() { return rollNo; }
    public double getMarks() { return marks; }

    public void setName(String n) { name = n; }
    public void setRollNo(int r) { rollNo = r; }
    public void setMarks(double m) { marks = m; }

    public void displayDetails() {
        System.out.println("Name: " + name + ", RollNo: " + rollNo + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Question01 s = new Question01();
        s.setName("Janvi");
        s.setRollNo(101);
        s.setMarks(95.5);

        System.out.println("Name via getter: " + s.getName());
        System.out.println("RollNo via getter: " + s.getRollNo());
        System.out.println("Marks via getter: " + s.getMarks());
        s.displayDetails();
    }
}

