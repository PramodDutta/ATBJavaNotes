package thetestingacademy.corejava.arraysDemo_06;

public class Arr001 {
    public static void main(String[] args) {
         //  90, 91, 89, 87
        //   pramod, 90, True XXXX
        // Strongly Types Lang
        // Data Type - int, string, float, boolean

        int[] numbers = {90,91,89,87}; // 4, Array - index 0-len -1
        String[] myStudents = {"Amit","Pramod","Lucky"}; // 3
        // numbers[3] // 87
        // myStudents[2] ? Lucky
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        System.out.println(myStudents[2]);



//        System.out.println(myStudents[3]);


        int[] a = new int[5]; // Reference Varaible
//        char c = 0 or /u0000
        // Len -> 5
        a[0] = 1;
        a[1] = 2;
//        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        //a[5]= ??
        System.out.println(a[2]);



    }
}
