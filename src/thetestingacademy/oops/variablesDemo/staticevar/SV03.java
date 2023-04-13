package thetestingacademy.oops.variablesDemo.staticevar;

public class SV03 {
    public static void main(String args[]) {
        new SV_3().b = 99;
        System.out.println(new SV_3().b);
    }
}

class SV_3 {
    static int b;
}

