import java.io.FileWriter;

public class Question01 {

    public static void main(String[] args) {

        try {

            FileWriter fw =
                    new FileWriter("student.txt");

            fw.write("Name : Janvi\n");
            fw.write("Roll No : 101\n");
            fw.write("Course : BCA\n");
            fw.write("Semester : 5");

            fw.close();

            System.out.println("File Created Successfully");
        }

        catch(Exception e) {
            System.out.println(e);
        }
    }
}
