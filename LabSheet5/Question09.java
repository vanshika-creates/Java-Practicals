class Vehicle {
    void start() { System.out.println("Vehicle starts"); }
    void stop() { System.out.println("Vehicle stops"); }
}
class Car extends Vehicle {
    void drive() { System.out.println("Car drives"); }
}
public class Question09 extends Car {
    void chargeBattery() { System.out.println("ElectricCar charges battery"); }

    public static void main(String[] args) {
        Question09 ec = new Question09();
        ec.start(); ec.drive(); ec.chargeBattery(); ec.stop();
    }
}

