import java.util.ArrayList;

class Student<T,U,V> {

    T id;
    U name;
    V marks;

    Student(T id,U name,V marks) {

        this.id=id;
        this.name=name;
        this.marks=marks;
    }

    void display() {

        System.out.println(id +
                " " +
                name +
                " " +
                marks);
    }
}

public class Question15 {

    public static void main(String[] args) {

        ArrayList<Student<Integer,String,Double>> students =
                new ArrayList<>();

        students.add(new Student<>(101,"Janvi",90.5));
        students.add(new Student<>(102,"Rahul",85.0));
        students.add(new Student<>(103,"Riya",92.0));
        students.add(new Student<>(104,"Aman",80.0));
        students.add(new Student<>(105,"Priya",89.0));

        for(Student<Integer,String,Double> s : students) {
            s.display();
        }

        System.out.println("Total Students = "
                + students.size());
    }
}
