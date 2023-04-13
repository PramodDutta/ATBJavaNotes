package thetestingacademy.corejava.loops_04.scannerDemo;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // Take some input
        // What is the type of the input?
        // python or JS
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your Name is "+name);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your Age is "+age);

        // InputStream


        scanner.close();





    }
}
