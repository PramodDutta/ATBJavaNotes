package thetestingacademy.exceptions;

public class Exception02 {
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
//            String name = null;
//            name.length();

            Integer[] i = new Integer[2];
            System.out.println(i[3]);
        } catch (NullPointerException e) {
            System.out.println("Null");
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out");
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
