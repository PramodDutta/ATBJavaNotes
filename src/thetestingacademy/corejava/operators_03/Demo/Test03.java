package thetestingacademy.corejava.operators_03.Demo;

public class Test03 {
    public static void main(String[] args) {
        // +
        int a = 10;
        int b = 243;
        int c = a+b;
        System.out.println(c);

        String name = "Pramod";
        String name2 = "10";

        //Behave - left -> right -> First is Int - Sum, First is String -> Contentation
        System.out.println(name+10+34);
        System.out.println(10+34+name); // +


    }
}
