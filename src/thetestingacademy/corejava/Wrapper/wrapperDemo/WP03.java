package thetestingacademy.corejava.Wrapper.wrapperDemo;

public class WP03 {
    public static void main(String[] args) {
        // String tO PRIMITIVE
        // parseX();

        String st1 = "123";
        int x = Integer.parseInt(st1);

        // Primitive to Wrapper
        int a = 10;
        Integer a2 = new Integer(a);
        System.out.println(a2);
        Integer b  = Integer.valueOf(a);

        int old = a2.intValue();
        System.out.println(old);

        // String to Wrapper Objects
        String ss = "123";
        Integer iii = new Integer(ss);
        System.out.println(iii);


        // Wrapper Object to String
        Integer ppp = new Integer(100);
        String pop = Integer.toString(ppp);

        // Wrapper Class Helpful Methods
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // Auto and Unboxing

        Integer ia = new Integer(100);
        Integer ii  = 100;

        boolean btt = true;
        Boolean btttt = new Boolean(btt);
        System.out.println(btttt);



    }
}
