package thetestingacademy.problem.oops.InterfaceDemo;

public class Interface03 {

    public static void main(String[] args) {
            IcanFly.m2();
            IcanFly icanFly = new Bird();
            icanFly.fly();
            icanFly.foo();
    }
}

interface IcanFly{
    void fly();
    // New feature in Java 7
    default void foo(){
        System.out.println("This is new feature");
    }
    static void m2(){
        System.out.println("M2 from I can fly");
    }
}

class Bird implements IcanFly{

    @Override
    public void fly() {
        System.out.println("Bird can fly Yes");
    }
}
