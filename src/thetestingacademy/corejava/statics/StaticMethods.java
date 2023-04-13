package thetestingacademy.corejava.statics;//package CoreJavaP3.Static;

public class StaticMethods {

    // static method
    static void m1()
    {
        int a = 20;
        System.out.println("from m1");

        // Cannot make a static reference to the non-static field b
        int b = 10; // compilation error

        // Cannot make a static reference to the
        // non-static method m2() from the type Test
        //m2();  // compilation error

        //  Cannot use super in a static context
       // System.out.println(super.a); // compiler error
    }

    // instance method
    void m2()
    {
        System.out.println("from m2");
    }



    public static void main(String[] args)
    {
        // main method
    }
}
