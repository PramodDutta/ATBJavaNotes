package atb.classdemo.innerClassDemo;

public class Inner02 {

    public static void main(String[] args) {
        P1 p1 = new P1();
        p1.eating();
    }
}


class P1 {
    int a = 10;

    void eating() {
        abstract class Child {
            int gold = 100;
            void hidden(){
                System.out.println("I am Hidden");
            }
            abstract void say();
        }
        class A extends Child{

            @Override
            void say() {

            }
        }
    }




}
