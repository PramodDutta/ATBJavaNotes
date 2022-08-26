package thetestingacademy.oops.abstraction.interfaceDemo;

public interface ICanFly {

    abstract void fly();

    // Default methods are methods that can have a body
    default void startFlying() {
        System.out.println("startFlying is starting");
    }

    //static methods in interfaces are similar to default methods but the only difference is that you can’t override them
    static void cleanVehicle(){
        System.out.println("I am cleaning vehicle");
    }
}
