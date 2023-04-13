package thetestingacademy.practice.problem01.APR01.P2;

public class RC01 {

    public static void main(String[] args) {
        A a = new A() {
            public void show(){
                System.out.println("H i am from An class");
            }
            @Override
            public String toString() {
                return super.toString();

            }
        };



    }

}

interface B{}

abstract class A{

}

class WithNoName extends A{

}
