package thetestingacademy.corejava.operators_03.misc_3;

public class Ter05 {
    public static void main(String[] args) {
        int a=10;
        int b=23;
        int c=12;
        int max=(a>b) ? ( (a>c) ? a : c) : ((b>c) ? b : c);
        System.out.println(max);
    }
}
