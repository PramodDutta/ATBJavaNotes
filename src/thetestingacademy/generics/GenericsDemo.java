package thetestingacademy.generics;

public class GenericsDemo {
    public static < T1, T2, T3 > void temp(T1 x, T2 y, T3 z) {
        System.out.println("This is x =" + x);
        System.out.println("This is y =" + y);
        System.out.println("This is z =" + z);

    }
    public static void main(String args[]) {
        temp(1, 2, 3);
    }
}
