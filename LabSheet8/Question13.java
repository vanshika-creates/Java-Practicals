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
        System.out.println(id+" "+name+" "+marks);
    }
}

public class Question13 {

    public static void main(String[] args) {

        Student<Integer,String,Double> s1 =
                new Student<>(101,"Janvi",90.5);

        Student<Integer,String,Double> s2 =
                new Student<>(102,"Rahul",88.0);

        Student<Integer,String,Double> s3 =
                new Student<>(103,"Riya",95.0);

        s1.display();
        s2.display();
        s3.display();
    }
}
