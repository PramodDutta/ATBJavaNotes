package thetestingacademy.exceptions;

public class Ex08 {
    public static void main(String[] args) {
        try {
            int a = 10 / 10;
        } catch (Exception a) {
            System.out.println("I am Catch 01");
        } finally {
            System.out.println("Finally 01");
        }
        try {
            int a = 10 / 0;
        } catch (Exception a) {
            System.out.println("I am Catch 02");
        } finally {
            System.out.println("Finally 02");
        }
        try {
            int a = 10 / 0;
        } catch (Exception a) {
            System.out.println("I am Catch 03");
            System.exit(-1);
        } finally {
            System.out.println("Finally 03");
        }
        try {
            int a = 10 / 20;
        } catch (Exception a) {
            System.out.println("I am Catch 04");
        } finally {
            System.out.println("Finally 04");
        }
    }
}
