package thetestingacademy.corejava.stringDemo_05.StringBuilder1;

public class SB02 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("TTA");

        StringBuilder sb2=new StringBuilder("TTA");

        System.out.println(sb1==sb2);

        System.out.println(sb1.equals(sb2));


        boolean b1= sb1.toString().contentEquals(sb2.toString());


        boolean b2= sb1.toString().equals(sb2.toString());
        System.out.println("b1 : "+b1);
        System.out.println("b2 : "+b2);
        sb1.append(" Pramod");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);



    }
}
