package thetestingacademy.exceptions.throwsdemo;

import java.io.FileReader;
import java.util.Scanner;

public class AutoClose {
    public static void main(String[] args) {
        extracted();
    }

    private static void extracted() {
        try(Scanner scanner  = new Scanner(System.in)) {
            Integer[] array = {2, 3};
            System.out.println(array[3]);
        }
    }
}
