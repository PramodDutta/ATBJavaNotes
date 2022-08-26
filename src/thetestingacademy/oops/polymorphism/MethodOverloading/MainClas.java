package thetestingacademy.oops.polymorphism.MethodOverloading;

public class MainClas {

    public static void main(String[] args) {
        new Person().printType(1);
        new Person().printType(1.3);
        new Person().printType("dsds",'2');

    }
}
