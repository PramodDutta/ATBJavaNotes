package thetestingacademy.problem.oops.InterfaceDemo;

public class MultipleInheritence {

    public static void main(String[] args) {
        A a = new C();
        B b = new C();
        C c = new C();
    }

}


class C implements A,B{

    @Override
    public void eay() {
        System.out.println("C from eat()");
    }

    @Override
    public void say() {
        System.out.println("C from say()");
    }
}

interface B{
    int b = 20;
    void eay();
}
interface A{
    int a = 10;
    void say();
}
