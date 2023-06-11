package thetestingacademy.oops.polymorphism.MethodOverloading;

import java.util.Objects;

public class Person {

    void Speak(byte x) {
        System.out.println(x + " is an byte");
    }
    int Speak(int x) {
        System.out.println(x + " is an int");
        return 0;
    }
    void Speak(float x) {
        System.out.println(x + " is an float");
    }
    void Speak(double x) {
        System.out.println(x + " is an double");
    }
    void Speak(char x) {
        System.out.println(x + " is an char");
    }
    void Speak(String s, char x) {
        System.out.println("Multiple Params");
    }
}
