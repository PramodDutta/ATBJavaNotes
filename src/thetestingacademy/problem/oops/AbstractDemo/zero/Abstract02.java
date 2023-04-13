package thetestingacademy.problem.oops.AbstractDemo.zero;


// Static in Abstract


public class Abstract02 {
    public static void main(String[] args) {
        Yo y = new Zo();
        y.eat();
        y.say();
        System.out.println(Yo.a);
        System.out.println(Zo.a);
        Yo.foo();
        Zo.foo();
    }
}

abstract class Yo {
    static int a = 10;
    abstract void say();
    static void foo(){
        System.out.println("Foo() from Yo");
    }
    void eat(){
        System.out.println("Yo eat()");
    };
}

class Zo extends Yo{

    @Override
    void say() {
        System.out.println("Zo Say()");
    }
}

