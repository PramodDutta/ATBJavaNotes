package thetestingacademy.oops.inheritence;

public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        A a = new C();
        B b = new C();
        a.m1();
        b.m1();
        c.m1();
    }
}


interface A{
    void m1();

}
interface B{
    void m1();
}
class C implements A,B {

    @Override
    public void m1() {
        System.out.println("Hello C");
    }
}