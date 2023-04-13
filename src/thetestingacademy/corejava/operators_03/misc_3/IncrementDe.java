package thetestingacademy.corejava.operators_03.misc_3;

public class IncrementDe {
    public static void main(String[] args) {
       int b = 99;
        System.out.println(++b + ++b); // 100 + 101 = 201
        System.out.println(b); // 101

        int d = 101;
        System.out.println(--d); // 100
        System.out.println(d--); // 100 d = 99
        System.out.println(d); // 99


    }
}
