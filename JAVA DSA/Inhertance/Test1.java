class Vehicle {

    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {

    void speed() {
        System.out.println("Car speed is 100 km/h");
    }
}

public class Test1 {

    public static void main(String[] args) {

        Car c = new Car();

        c.run();
        c.speed();
    }
}