package thetestingacademy.corejava.statics;

public class StaticBlock {

    // static variable
    static int a = 10;
    static int b;

    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
        // User case - If you want to do someting first thing before any code.
        // Open Webdriver driver = new ChromeDriver();
        // FileInputStream f = new FileInputStream();
    }

    public static void main(String[] args)
    {
        System.out.println("from main");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}
