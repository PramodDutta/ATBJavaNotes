package thetestingacademy.oops.variablesDemo.staticevar;

public class SV01 {
    //Static variables are also called as Class variables.
    //Memory will be allocated for static variables at the time of loading the class.

    public static void main(String args[]){
        SV_1 h=new SV_1();
        System.out.println(h.b);
        h.b=99;
        System.out.println(h.b);
    }
}
class SV_1 {
    static int b;
}