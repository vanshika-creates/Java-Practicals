class Animal {
    void eat() { System.out.println("Animal eats"); }
    void sleep() { System.out.println("Animal sleeps"); }
}
public class Question04 extends Animal {
    void bark() { System.out.println("Dog barks"); }

    public static void main(String[] args) {
        Question04 d = new Question04();
        d.eat(); d.sleep(); d.bark();
    }
}

