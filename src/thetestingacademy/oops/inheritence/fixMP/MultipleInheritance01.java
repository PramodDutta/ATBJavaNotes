package thetestingacademy.oops.inheritence.fixMP;

public class MultipleInheritance01 {
    public static void main(String[] args) {
        C c = new C();
        A a = new C();
        B b = new C();
        a.m2();
        b.m1();
        c.m1();
    }
}


interface A{
    default void m2(){
        System.out.println("I am A");
    };

}

interface B{
    void m1();
}

class C implements A,B{

    @Override
    public void m1() {
        System.out.println("Hello C");
    }
}