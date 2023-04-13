package thetestingacademy.oops.innerclasses.anonymousclass;

public class Anony01 {
    public static void main(String[] args) {

        int age = 30;
        A a = new A() {
            @Override
            void test1() {
                System.out.println("Hello A!!"+ age);
            }
        };
        a.test1();

        B b = new B();
        b.testB();
        //System.out.println(r);
    }

}

class B{
    int var_b = 12;
    void testB() {
        A a = new A() {
            // No Class Name
            // No Constructor
            int test = 100;
            static int p = 100;
            @Override
            void test1() {
                 // Secure information here
                p = 200;
                System.out.println(var_b);
                System.out.println(test);
//                System.out.println(A.name);
            }
        };
        a.test1();

    }
}

abstract class A{
    int a = 10;
//    static int name = 200;
    abstract void test1();
}
