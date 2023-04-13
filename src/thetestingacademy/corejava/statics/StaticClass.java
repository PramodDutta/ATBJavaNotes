package thetestingacademy.corejava.statics;

public class StaticClass {

    private static String str = "Pramod";

    // Static class
    static class MyNestedClass {
        // non-static method
        public void disp(){
            System.out.println(str);
        }
    }

    public static void main(String args[])
    {
        MyNestedClass obj = new MyNestedClass();
        obj.disp();
    }
}
