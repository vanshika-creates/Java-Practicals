class Vehicle { void start() { System.out.println("Vehicle starts"); } }
class Car extends Vehicle { void drive() { System.out.println("Car drives"); } }
interface Electric { void chargeBattery(); }

public class Question18 extends Car implements Electric {
    public void chargeBattery() { System.out.println("Battery charging"); }

    public static void main(String[] args) {
        Question18 ec = new Question18();
        ec.start(); ec.drive(); ec.chargeBattery();
    }
}
