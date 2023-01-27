package thetestingacademy.exceptions.throwsdemo;

import java.util.Scanner;

public class Ex09 {

    public static void main(String[] args) {
        extracted();
    }
    private static void extracted() {
        try(Scanner scanner  = new Scanner(System.in)) {
            Integer[] array = {2, 3};
            System.out.println(array[3]);
            //throw new ArrayIndexOutOfBoundsException();
            ArrayIndexOutOfBoundsException a = new ArrayIndexOutOfBoundsException();
            throw a;
            //System.out.println("I am Waste Code");
//            {
//                System.out.println("I am unreachble Code");
//            }
        }
    }
}
