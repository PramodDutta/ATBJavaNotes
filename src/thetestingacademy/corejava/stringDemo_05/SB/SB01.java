package thetestingacademy.corejava.stringDemo_05.SB;

public class SB01 {
    public static void main(String[] args) {

        StringBuffer sb1=new StringBuffer("TTA");
        StringBuffer sb2=new StringBuffer("TTA");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        boolean b1= sb1.toString().contentEquals(sb2.toString());
        boolean b2= sb1.toString().equals(sb2.toString());
        System.out.println("b1 : "+b1);
        System.out.println("b2 : "+b2);
        sb1.append(" Prmaod");
        System.out.println(sb1);

    }
}
