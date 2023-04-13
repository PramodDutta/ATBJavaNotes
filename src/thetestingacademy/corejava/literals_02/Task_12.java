package thetestingacademy.corejava.literals_02;

public class Task_12 {
    public static void main(String[] args) {
        char c = '\n';
        char c2 = '\t';
        char c3 = '\r';
        //char c4 = '\u0000';

        System.out.println(c);
        System.out.println(c2+"Hello World");
        System.out.println(c3);

        // ASCII Table
        // 0-9 48-57
        // A-Z 65-90
        // a-z 97-122
        // 0-9 48-57
        char ch9=65535;
        char ch10 = '\u0062';
        System.out.println(ch9);
        System.out.println(ch10);

        char ch11 = '\101';
        char ch12 = '\376';
        System.out.println(ch11);
        System.out.println(ch12);


    }
}
