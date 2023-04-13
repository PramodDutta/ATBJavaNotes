package thetestingacademy.corejava.staticDEMO;

import java.util.Scanner;

public class StringArgs {
    // Program input to Main Functions > 10,10, 10
    public static void main(String[] args) {
        // args = array [] <-

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args.length);
        //args[3] = 23;


        // Main asking user to input
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        args[0] =String.valueOf(sc.nextInt());
    }
}
