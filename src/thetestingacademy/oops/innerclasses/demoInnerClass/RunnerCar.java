package thetestingacademy.oops.innerclasses.demoInnerClass;

public class RunnerCar {

    public static void main(String[] args) {
        Car c = new Car("Lambo");
        // engine?
        Car.Engine engine = c.new Engine("400");
        engine.start();
        c.drive();







    }
}
