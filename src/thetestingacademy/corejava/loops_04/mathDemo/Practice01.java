package thetestingacademy.corejava.loops_04.mathDemo;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {

        // 10,20,30
        // Result -

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        double x = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        double y = scanner.nextDouble();
        System.out.println("Enter the value of z: ");
        double z = scanner.nextDouble();
        double result = 0;
        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println(result);
        scanner.close();



    }
}
