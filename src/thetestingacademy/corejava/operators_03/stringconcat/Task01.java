package thetestingacademy.corejava.operators_03.stringconcat;

public class Task01 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        String s1 = "Pramod";
        String s2 = "Kumar";

        // + -> // int + int = int
          //char + char = int
          // String + String = String
          // boolean + boolean = boolean
        // int + String = String + int = String

//        System.out.println(a+b);
//        System.out.println(s1+s2);
        // left -> right Java will execute
        //Left to right → Flow
        System.out.println(a+b+s1+s2); // 30PramodKumar
        System.out.println(s1+s2+a+b); // PramodKumar1020
        System.out.println(s1+s2+(a+b)); // PramodKumar30

        char c1 = 'p';
        char c2 = 'k';
        System.out.println(c1+c2);








    }
}
