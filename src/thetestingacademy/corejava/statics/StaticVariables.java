package thetestingacademy.corejava.statics;

public class StaticVariables {

    static int a = m1();

    // static block
    static {
        System.out.println("Inside static block");
    }

    // static method
    static int m1() {
        System.out.println("from m1");
        return 20;
    }

    // static method(main !!)
    public static void main(String[] args)
    {
        System.out.println("Value of a : "+a);
        System.out.println("from main");
    }
}
