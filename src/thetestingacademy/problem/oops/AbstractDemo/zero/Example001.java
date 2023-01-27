package thetestingacademy.problem.oops.AbstractDemo.zero;

public class Example001 {
    public static void main(String[] args) {
        AbstractClass001 abstractClass001 = new P();
        abstractClass001.m1();
    }
}

// If a class have any abstract method, class must be abstract also
abstract class AbstractClass001{
    abstract void m1();
}

class P extends AbstractClass001{
    @Override
    void m1() {
        System.out.println("Have to implement");
    }
}


