package thetestingacademy.problem.oops.AbstractDemo.zero;

public class OOPsProblemAbs1 {

    public static void main(String[] args) {
        //Parent1 c = new Child();
        Child1 c = new Child1();
        c.area();
    }
}

abstract class Parent1{
    abstract void area();
}

class Child1 extends Parent1{

    @Override
    void area() {

    }
}
