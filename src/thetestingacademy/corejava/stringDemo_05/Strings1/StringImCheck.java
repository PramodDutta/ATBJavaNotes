package thetestingacademy.corejava.stringDemo_05.Strings1;

public class StringImCheck {
    public static void main(String[] args) {

        String str1 = "Hello"; //String pool - Not body
        String str2 = str1;
        str1 = str1.concat(" World");
        System.out.println(str1);
        System.out.println(str2);


    }
}
