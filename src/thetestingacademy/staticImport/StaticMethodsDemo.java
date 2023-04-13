package thetestingacademy.staticImport;

final public class StaticMethodsDemo {

    final public static void main(String[] args) {
        // 3 ways to call the Static methods
        // 1 way to call instance methods

        P01 p01 = new P01();
        p01.m1();
        P01.m2();
        P01 p02 = null;
//        p02.m1();
        p02.m2();

    }

}

 class P01{
    int a =10;
    static int b = 20;
    void m1(){
        System.out.println("m1");
        System.out.println(a);
        System.out.println(b);
    }
    static void m2(){
//        System.out.println(a);
        System.out.println(b);
    }

}