package thetestingacademy.oops.abstraction.interfaceDemo.P1;

public interface IPramod {

    final static int a = 10; //final static


    //IPramod(){}
    abstract void print();

    default void print2() {
        System.out.println("No possible");
    }

    static void print3() {
        System.out.println("No possible");
    }

}

interface B {
}

interface C {
}

interface D {
}
