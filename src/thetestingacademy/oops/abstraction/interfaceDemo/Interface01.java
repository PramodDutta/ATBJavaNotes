package thetestingacademy.oops.abstraction.interfaceDemo;

public class Interface01 {
    public static void main(String[] args) {
        Hello h = new Hello();
        h.say();
        h.hello();

        II i = new Hello();
        i.hello();
        i.say();

    }
}

interface II{
    void say();
    default void hello(){
        System.out.println("Hello Default");
    }
}

interface P{}

class Hello implements II{

    @Override
    public void say() {

    }
}
