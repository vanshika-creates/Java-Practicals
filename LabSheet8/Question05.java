class Product<T,U> {

    T id;
    U price;

    Product(T id,U price) {
        this.id=id;
        this.price=price;
    }

    void display() {
        System.out.println(id+" "+price);
    }
}

public class Question05 {

    public static void main(String[] args) {

        Product<Integer,Double> p1=
                new Product<>(1,1000.0);

        Product<Integer,Double> p2=
                new Product<>(2,2000.0);

        Product<Integer,Double> p3=
                new Product<>(3,3000.0);

        p1.display();
        p2.display();
        p3.display();
    }
}
