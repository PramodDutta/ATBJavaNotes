package thetestingacademy.problem.oops.InnerClassDemo;

public class OOPsDemo {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.m1();

        Outer.Inner io = o.new Inner();
        Outer.Inner io2 = new Outer().new Inner();
        io.m2();
        io2.m2();
    }
}


class Outer{
    static int uu = 10;
    int a = 10;
    void m1(){
        System.out.println("Outer");
        new Inner().m2();
    }
    class Inner{
        static int a1 = 10;
        void m2(){
            System.out.println("Inner");
            System.out.println("From Inner access to Outer Data variable -> "+a);
        }
    }
}