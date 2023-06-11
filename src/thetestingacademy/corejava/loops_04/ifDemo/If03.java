package thetestingacademy.corejava.loops_04.ifDemo;

import java.util.Scanner;

public class If03 {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter a,b,c");
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        int c = sc1.nextInt();
//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);

////         a,b
//        if (a > b) {
//            System.out.println(" Greater -> " + a);
//        }
//        if (b > a) {
//            System.out.println(" Greater -> " + b);
//        }
//
        // a > b && a > c ->  a
        //  b > a && b >c  ->  b
        // c ?

        if (a > b && a > c) {
            System.out.println(a);
        }
        else if( b> a && b >c){
            System.out.println(b);
        }else{
            System.out.println(c);
        }


        sc1.close();


    }
}
