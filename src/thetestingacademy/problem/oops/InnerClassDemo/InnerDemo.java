package thetestingacademy.problem.oops.InnerClassDemo;

public class InnerDemo {
    public static void main(String[] args) {
        O o = new O();
        o.m1();
    }
}

class O{
    void m1(){
        class I{ // Local Inner Class
            void m2(){
                System.out.println("Inner");
            }
        }
        I localIn = new I();
        localIn.m2();
    }
}
