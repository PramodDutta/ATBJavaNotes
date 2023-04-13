package thetestingacademy.corejava.Wrapper.wrapperDemo;

public class WP01 {
    public static void main(String[] args) {
        char ch = 'a';

        // Autoboxing- primitive to Character object conversion
        Character a = ch;


        System.out.println(a);

         // a -> Object Ch [A] functions


        Character ch2 = 'a';
        // unboxing - Character object to primitive conversion
        char a2 = ch2;

        System.out.println(a2);
    }
}
