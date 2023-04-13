package thetestingacademy.practice.problem01.APR01;

public class RC {
    public static void main(String[] args) {
        P p1 = new P();
        C c1 = new C();
        p1 = c1;  // Valid -> Upcasting
        c1 = (C)p1; // No



    }
}

class P{}
class C extends P{

}

