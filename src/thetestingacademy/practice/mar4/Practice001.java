package thetestingacademy.practice.mar4;

public class Practice001 {
    public static void main(String[] args) {
        boolean b = !!!false; // Compiler is not so smart // QA Lead -
        System.out.println(b);

        int a = 10;
        a = a+10;
        System.out.println(a);
        // QA Compiler, .class will be created and then it will be executed


        System.out.println("-----------------");

        int t  = ~5; // 5 = 00000101
        System.out.println(t);


    }
}
