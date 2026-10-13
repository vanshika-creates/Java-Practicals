class Animal {
    void makeSound() { System.out.println("Animal sound"); }
}
class Dog extends Animal {
    @Override void makeSound() { System.out.println("Dog barks"); }
}
class Cat extends Animal {
    @Override void makeSound() { System.out.println("Cat meows"); }
}
public class Question13 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        a1.makeSound(); a2.makeSound();
    }
}

