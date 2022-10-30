package thetestingacademy.exceptions;

import java.util.Scanner;

public class Exception05FinallyExit {
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
        Scanner scanner = null;
        try {
//            String name = null;
//            name.length();
            scanner = new Scanner(System.in);
            Integer[] i = new Integer[2];
            System.out.println(i[3]);

        } catch (NullPointerException e) {
            System.out.println("Null");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out");
            System.exit(1);
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Scanner Closed");
            scanner.close();
        }
    }
}
