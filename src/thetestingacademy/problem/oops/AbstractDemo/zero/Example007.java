package thetestingacademy.problem.oops.AbstractDemo.zero;

public class Example007 {
    public static void main(String[] args) {
        StaticDemo.m1();
    }
}


abstract class StaticDemo{
    int a = 10;
    static void m1(){
        System.out.println("Static");
    }
}
