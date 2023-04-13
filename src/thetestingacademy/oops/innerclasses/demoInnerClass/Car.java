package thetestingacademy.oops.innerclasses.demoInnerClass;

public class Car {
    String make; // Instance Variables

    // Parameterimized Constructor
    public Car(String make) {
        this.make = make;
    }

    // Method
    void drive(){
        System.out.println("You can driver Car");
    }

    // Inner Classe
    public class Engine{
        // Instance Variables
        String hoursePower;

        // Parameterimized Construct
        public Engine(String hoursePower) {
            this.hoursePower = hoursePower;
        }

        // Method
        void start(){
            System.out.println("Enginer is started!! -> " + make);
        }
    }
}

