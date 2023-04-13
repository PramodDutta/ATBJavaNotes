package thetestingacademy.corejava.operators_03.misc_3;

public class Cast2 {

    public static void main(String[] args) {
        int a=300; // 32 bit -> 8 bit
        //byte b=a; // INVALID – Implicit Casting
        byte b = (byte)a;// VALID – Explicit Casting
        System.out.println(b);
        System.out.println(a);



    }
}
