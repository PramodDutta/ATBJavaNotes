package thetestingacademy.oops.abstraction.interfaceDemo;

public class MainClass {

    public static void main(String[] args) {
                new Cat().fly();
                new Bird().fly();
                new Bird().startFlying();
                ICanFly.cleanVehicle();
    }
}
