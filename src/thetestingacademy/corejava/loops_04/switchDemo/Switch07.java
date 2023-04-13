package thetestingacademy.corejava.loops_04.switchDemo;

public class Switch07 {
    public static void main(String[] args) {
       // JDK 13


        String code = "w";
        int val = switch (code) {
            case "x", "y" :
                yield 1;
            case "z", "w" :
                yield 2;
            default:
                yield 3;
        };
        System.out.println(val);

        int itemCode = 005;
        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003,004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

    }
}
