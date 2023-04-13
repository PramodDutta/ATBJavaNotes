package thetestingacademy.corejava.loops_04.fordemo;

public class For07 {

    public static void main(String[] args) {
        // Can Break be include in the For loops
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            break;
//        }
//        System.out.println("END");


        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Exit the loop when i equals 5
            }
            System.out.println(i);
        }
    }
}
