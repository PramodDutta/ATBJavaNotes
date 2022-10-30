package thetestingacademy.exceptions;

public class Exception01Fixed {
    public static void main(String[] args) {
        extracted2();
        System.out.println("MAIN Execute");
    }

    private static void extracted2() {
        extracted1();
        System.out.println("extracted2 Execute");
    }

    private static void extracted1() {
        extracted();
        System.out.println("extracted1 Execute");
    }

    private static void extracted() {
        try {
            String name = null;
            name.length();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
