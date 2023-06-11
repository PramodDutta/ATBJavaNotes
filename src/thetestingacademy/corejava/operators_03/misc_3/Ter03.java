package thetestingacademy.corejava.operators_03.misc_3;

public class Ter03 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int max=a < b ? b : a;
        System.out.println(max);
        int min = a > b ? b : a;
        System.out.println(min);
    }
}
