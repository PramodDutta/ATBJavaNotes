package thetestingacademy.corejava.stringDemo_05.Strings1;

public class Strin04 {
    public static void main(String[] args) {
        String str1="TTA";
        String str2="TTA";
        String str3="TTa";
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str2));
        System.out.println(str3.equalsIgnoreCase(str2));
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str2));

        str2="Tta";
        str3="TTa";

        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str2));

    }
}
