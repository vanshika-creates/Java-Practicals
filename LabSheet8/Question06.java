class Employee<T,U> {

    T id;
    U name;

    Employee(T id,U name) {

        this.id=id;
        this.name=name;
    }

    void display() {

        System.out.println(id+" "+name);
    }
}

public class Question06 {

    public static void main(String[] args) {

        Employee<Integer,String> e=
                new Employee<>(101,"Janvi");

        e.display();
    }
}
