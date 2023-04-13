package thetestingacademy.corejava.operators_03.narrowing_2;

public class Narrow {
    public static void main(String[] args) {
        int a=300;
       // byte b=a; // INVALID – Implicit Casting
        byte b2 = (byte)a; // VALID – Explicit Casting
    }
}

