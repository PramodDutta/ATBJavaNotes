package thetestingacademy.problem.oops.InnerClassDemo;

public class StaticInner {
    public static void main(String[] args) {
            O2 o2 = new O2();
            o2.m1();

            //new O2.I2().m3();
    }
}

class O2{
    int a = 10;
    void m1(){
        System.out.println("a" + a);
    }
    static void m2(){
        System.out.println("m2");
    }
    class I2{
        int x = 10;
        final int z = 10;
        static int z2 = 100;
        void m3(){
            System.out.println("m3");
            System.out.println(z2);
        }
    }
}

