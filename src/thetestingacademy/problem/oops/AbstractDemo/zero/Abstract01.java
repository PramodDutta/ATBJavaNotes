package thetestingacademy.problem.oops.AbstractDemo.zero;

public class Abstract01 {
    public static void main(String[] args) {
        Person01 p1 = new PStudent();
        p1.say();
    }
}

abstract class Person01 {
    abstract void say();
    void eat(){
        System.out.println("Hello eat from Person");
    };
}

abstract class Student1 extends Person01{
    @Override
    void say() {
        System.out.println("Student eat()");
    }
}

class PStudent extends Student1
{

}
