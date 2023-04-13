package thetestingacademy.corejava.Wrapper.wrapperDemo;

public class EX01 {
    public static void main(String[] args) {
        Integer x = 140, y = 140; // JVM - -128 to 127
        if (x == y)
            System.out.println("Same");
        else
            System.out.println("Not Same");


    }
}
