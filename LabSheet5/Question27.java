abstract class Vehicle {
    abstract void run();
}

class Car extends Vehicle {
    void run() { System.out.println("Car is running"); }
}

class Bike extends Vehicle {
    void run() { System.out.println("Bike is running"); }
}

public class Question27 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.run();
        v2.run();
    }
}
