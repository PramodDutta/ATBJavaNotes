package thetestingacademy.corejava.operators_03.misc_3;

public class RelationDemo {
    public static void main(String[] args) {
        // 10 ==10
        // 10 == 20 -> false
        System.out.println('A' == 65);
        byte b = 65;
        System.out.println('A' == b);
        System.out.println(65 == b);
        System.out.println('A' == 65L);
        System.out.println('A' == 65.0);
        System.out.println('A' == 65.0F);
    }
}
