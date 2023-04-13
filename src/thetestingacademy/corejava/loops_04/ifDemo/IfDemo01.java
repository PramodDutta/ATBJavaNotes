package thetestingacademy.corejava.loops_04.ifDemo;

public class IfDemo01 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int max = 0;

        if (a > b && a > c)
            max = a;
        else if (b > a && b > c)
            max = b;
        else if (b > a && b > c)
            max = b;
        else if (b > a && b > c)
            max = b;
        else if (b > a && b > c)
            max = b;
        else
            max = c;
        System.out.println("Max value is " + max);


    }
}
