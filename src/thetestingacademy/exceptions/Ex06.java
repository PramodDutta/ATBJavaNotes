package thetestingacademy.exceptions;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        ProblemF problemF = new ProblemF();
        int x = problemF.show();
        System.out.println(x);
    }
}

class ProblemF {
    int a = 10;

    int show() {
        try {
            a = 10 / 0;
            System.out.println("In Try -> " + a);
            return a;
        } catch (Exception e) {
            try {
                a = 20 / 0;
            } catch (Exception e1) {
                System.out.println("Yes");
            }
            System.out.println("In Catch -> " + a);
            return a;
        } finally {

            // 100% executed
            // driver.close();
            // db.close()
            // fileIn.clioe();

            System.out.println("I am Final");
            //int[] a1 = new int[-1];
        }
    }
}