class Animal {
    void eat() { System.out.println("Animal eats"); }
}
class Dog extends Animal {
    void bark() { System.out.println("Dog barks"); }
}
public class Question07 extends Dog {
    void play() { System.out.println("Puppy plays"); }

    public static void main(String[] args) {
        Question07 p = new Question07();
        p.eat(); p.bark(); p.play();
    }
}

