package thetestingacademy.oops.abstraction.interfaceDemo;

public class DefaultDemo {
    public static void main(String args[]){
        Car car = new Car();
        car.cleanVehicle();
        car.startVehicle();
    }
}

interface Vehicle {
    void cleanVehicle();

    default void startVehicle() {
        System.out.println("Vehicle is starting");
    }
}

class Car implements Vehicle {
    @Override
    public void cleanVehicle() {
        System.out.println("Cleaning the vehicle");
    }
}
