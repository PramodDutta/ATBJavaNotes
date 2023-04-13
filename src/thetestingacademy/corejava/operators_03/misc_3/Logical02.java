package thetestingacademy.corejava.operators_03.misc_3;

public class Logical02 {
    public static void main(String[] args) {
        int a = 12;
        boolean b = a > 10 || a++ < 5;
        System.out.println(a);
        System.out.println(b);
    }
}
