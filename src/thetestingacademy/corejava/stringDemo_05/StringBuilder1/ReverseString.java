package thetestingacademy.corejava.stringDemo_05.StringBuilder1;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1;
        System.out.println("Enter a String");
        sb1 = new StringBuilder(sc.nextLine());
        sb1.reverse();
        System.out.println(sb1);
    }
}
