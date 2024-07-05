package interfacesDemo;

class Vehicle1 {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car extends Vehicle1 {
    @Override
    void move() {
        System.out.println("Car is moving fast");
    }
}

class Bicycle extends Vehicle1 {
    @Override
    void move() {
        System.out.println("Bicycle is moving on a path");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Vehicle1 myVehicle = new Vehicle1();
        Vehicle1 myCar = new Car();
        Vehicle1 myBicycle = new Bicycle();

        myVehicle.move(); // Outputs: Vehicle is moving
        myCar.move(); // Outputs: Car is moving fast
        myBicycle.move(); // Outputs: Bicycle is moving on a path
    }
}