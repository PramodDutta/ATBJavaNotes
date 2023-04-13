package thetestingacademy.problem.oops.InterfaceDemo;

public class Interface05 {
    public static void main(String[] args) {
//        Inter05 ref= null;
        //ref = new Inter05();
//        ref = new Hello();
        Inter05 ref2 = new Hello();
        ref2.m1();
        ref2.m2();
    }
}

interface Inter05 {
    void m1();

    public abstract void m2();

    int A = 10;
    public final int B = 20;
}

class Hello implements Inter05 {
    public void m1() {
        System.out.println("Hello -> m1() :" + A);
    }

    public void m2() {
        System.out.println("Hello -> m2() :" + B);
    }
}
