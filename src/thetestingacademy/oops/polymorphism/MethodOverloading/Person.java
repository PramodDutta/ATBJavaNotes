package thetestingacademy.oops.polymorphism.MethodOverloading;

import java.util.Objects;

public class Person {

    void printType(byte x) {
        System.out.println(x + " is an byte");
    }
    void printType(int x) {
        System.out.println(x + " is an int");
    }
    void printType(float x) {
        System.out.println(x + " is an float");
    }
    void printType(double x) {
        System.out.println(x + " is an double");
    }
    void printType(char x) {
        System.out.println(x + " is an char");
    }
    void printType(String s, char x) {
        System.out.println("Multiple Params");
    }
}
