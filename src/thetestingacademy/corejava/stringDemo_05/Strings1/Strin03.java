package thetestingacademy.corejava.stringDemo_05.Strings1;

public class Strin03 {
    public static void main(String[] args) {
        String str1="Hello";
        String str2=" Guys";
        String str3="Hello Guys";


        String str4= str1.concat(str2);
        String str5="Hello".concat(" Guys");



        System.out.println(str3==str4);


//
        System.out.println(str3==str5);



        System.out.println(str4==str5);



        String str6=str1+str2;
        String str7="Hello" + " Guys"; //IMP- Literal + Literal
        System.out.println(str3==str6);


        System.out.println(str3==str7);



    }
}
