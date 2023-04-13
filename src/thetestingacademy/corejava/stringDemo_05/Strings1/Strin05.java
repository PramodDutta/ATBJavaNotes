package thetestingacademy.corejava.stringDemo_05.Strings1;

public class Strin05 {
    public static void main(String[] args) {
        String str="pramoddutta";
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(8));
        System.out.println(str.substring(5));



        System.out.println(str.substring(3,8));
        System.out.println(str.substring(3,9));
        System.out.println(str.indexOf("mod"));
        System.out.println(str.indexOf("i"));
        System.out.println(str.lastIndexOf("i"));
        System.out.println(str.contains("pra"));
        System.out.println(str.contains("dut"));
        System.out.println(str.contains("tta"));
    }
}
