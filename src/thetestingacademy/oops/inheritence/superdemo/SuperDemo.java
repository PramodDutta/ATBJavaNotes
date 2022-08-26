package thetestingacademy.oops.inheritence.superdemo;

public class SuperDemo {

    public static void main(String[] args) {
        Car corolla = new Car(3);
        corolla.display();
    }
}


class Vehicle { //Base class vehicle

    int fuelCap = 90; //fuelCap field inside SuperClass

    Vehicle(){
        System.out.println("Vehicle Created");
    }
    Vehicle(int seats){
        System.out.println("New Seats -> "+ seats);
    }

    public void display() {   //display method inside SuperClass
        System.out.println("I am from the Vehicle Class");
    }

}

class Car extends Vehicle { // sub class Car extending from Vehicle

    int fuelCap = 50; //fuelCap field inside SubClass

    Car(){
        super();
    }
    Car(int a){
        super(a);
    }

    public void display() {

        //accessing the field of parent class using super*/
        System.out.println("Fuel Capacity from the Vehicle class: " + super.fuelCap);
        //without using super the field of current class shadows the field of parant class*/
        System.out.println("Fuel Capacity from the Car class: " + fuelCap);
        super.display();


    }

}
