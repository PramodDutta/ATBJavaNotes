package thetestingacademy.corejava.loops_04.ifDemo;

import java.util.Scanner;

public class If02 {
    public static void main(String[] args) {
        // Take an input from user and then Odd or Even.

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter your Number, I will tell you Odd or Even\n");

        int a = sc.nextInt();
        a = 34;

       // true - if, false - else


        if(a%2 == 1){
            System.out.println("ODD Number");
        }else{
            System.out.println("Even Number");
        }

    }
}
