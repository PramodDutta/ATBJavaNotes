package CoreJavaP3.Static;

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
        StaticClass.MyNestedClass obj
                = new StaticClass.MyNestedClass();
        obj.disp();
    }
}
