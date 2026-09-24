abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Normal method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle {

    // Providing implementation
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {

        Vehicle v = new Car();

        v.start();
        v.stop();
    }
}