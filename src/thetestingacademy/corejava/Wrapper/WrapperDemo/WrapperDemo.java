package thetestingacademy.corejava.Wrapper.WrapperDemo;

public class WrapperDemo {

    public static void main(String[] args) {

        Character ch = 'a';

        // unboxing - Character object to primitive conversion
        char a = ch;
        System.out.println(a);

        // int data type
        int b = 10;

        //wrapping around Integer object
//        Integer intobj = new Integer(b);

        System.out.println(Integer.valueOf("55"));
        System.out.println(Integer.parseInt("55"));
        System.out.println(Integer.max(34,54));

        //Auto Box
        Integer values = 10;
//        Integer values2 = new Integer(10);
//        Integer values3 = new Integer(10);
        values++;
        System.out.println(values);
//        System.out.println(values2 == values3);
//        System.out.println(values2.equals(values3));


    }
}
