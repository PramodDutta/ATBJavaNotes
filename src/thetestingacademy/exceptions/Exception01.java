package thetestingacademy.exceptions;

public class Exception01 {
    public static void main(String[] args) {
        extracted2();
    }

    private static void extracted2() {
        extracted1();
        System.out.println("Will not Execute");
    }

    private static void extracted1() {
        extracted();
    }

    private static void extracted() {
        String name = null;
        name.length();
    }
}
