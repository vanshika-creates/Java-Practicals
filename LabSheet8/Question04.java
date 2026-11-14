class Pair<T,U> {

    T id;
    U name;

    Pair(T id,U name) {
        this.id=id;
        this.name=name;
    }

    void display() {
        System.out.println(id+" "+name);
    }
}

public class Question04 {

    public static void main(String[] args) {

        Pair<Integer,String> p =
                new Pair<>(101,"Janvi");

        p.display();
    }
}
