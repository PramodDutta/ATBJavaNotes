package thetestingacademy.problem.oops.InnerClassDemo;

public class Inner02 {
    public static void main(String[] args) {
        O1.I1 oi = new O1().new I1();
        oi.m1();
    }
}

class O1{
    int age = 1;
    class I1{
        int age = 2;
        void m1(){
            int age = 3;
            System.out.println(age);
            System.out.println(I1.this.age);
            System.out.println(O1.this.age);
            //System.out.println(super.age); - not possible
        }

    }
}
