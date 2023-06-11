package thetestingacademy.oops.abstraction.interfaceDemo.pp;

public class A {

    public static void main(String[] args) {

       

    }
}


abstract class I{
    abstract void say();
}

abstract class P extends I{
}

class CC extends P{

    @Override
    void say() {

    }
}
