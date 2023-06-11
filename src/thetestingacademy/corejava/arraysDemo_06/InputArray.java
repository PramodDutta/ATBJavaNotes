package thetestingacademy.corejava.arraysDemo_06;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Assigment = How many subject? = n
        // Array with size n
        // print all the n subjects numbers


        // n, while i<=n , print array[i]


        int[] array = new int[3];
        System.out.println("Enter your mark for Sub 1");
        array[0] = sc.nextInt();
        System.out.println("Enter your mark for Sub 2");
        array[1] = sc.nextInt();
        System.out.println("Enter your mark for Sub 3");
        array[2] = sc.nextInt();
        System.out.println("Your Marks are " + array[0] + " - " + array[1] + " - " + array[2]);
    }
}
