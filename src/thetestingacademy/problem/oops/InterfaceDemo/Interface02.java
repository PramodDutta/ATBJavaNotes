package thetestingacademy.problem.oops.InterfaceDemo;

public class Interface02 {

    public static void main(String[] args) {
        System.out.println(PP.a);
        PP p = new foo();
        p.m1();
    }
}

interface PP{
    int a =10;
    // Only Static variables
    void m1();
}

abstract class Rofl  implements PP{

    abstract void say();

}

class foo extends Rofl{

    @Override
    public void m1() {
        System.out.println("m1 from foo");
    }

    @Override
    void say() {
        System.out.println("say()");
    }
}