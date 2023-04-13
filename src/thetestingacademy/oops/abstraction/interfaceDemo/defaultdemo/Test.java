package thetestingacademy.oops.abstraction.interfaceDemo.defaultdemo;

public class Test {
    public static void main(String[] args) {
        Cool main = new Cool();
        main.printSomething();
    }
}


interface InterfaceA {
    default void printSomething() {
        System.out.println("I am inside A interface");
    }
}

interface InterfaceB {
    default void printSomething() {
        System.out.println("I am inside B interface");
    }
}


class Cool implements InterfaceA, InterfaceB {

    // Diamond Problem Solved by super Keyword
    @Override
    public void printSomething() {
           InterfaceA.super.printSomething();
           InterfaceB.super.printSomething();
    }
}