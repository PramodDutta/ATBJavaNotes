package thetestingacademy.problem.oops.InterfaceDemo;

public class Interface06 {

    public static void main(String[] args) {
        HH h = new HH(); System.out.println(h.A);
        System.out.println(h.B);
        h.m1();
        h.m2();
    }
}


interface Inter06 {
    void m1();

    int A = 10;
}

interface Inter062 {
    void m2();

    int B = 11;
}

class HH implements Inter06, Inter062 {
    public void m1() {
        System.out.println("Hello -> m1()");
    }

    @Override
    public void m2() {

    }
}