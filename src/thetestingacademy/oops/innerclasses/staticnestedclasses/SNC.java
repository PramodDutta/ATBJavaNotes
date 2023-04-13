package thetestingacademy.oops.innerclasses.staticnestedclasses;

public class SNC {

    public static void main(String[] args) {

        OO.SNCI oo = new OO.SNCI();
        oo.show();

    }
}

class OO{
    static  int o =100;
    int a = 900;
    static class SNCI{
        void show(){
            System.out.println(o);
            //Only a static member of outer class can be accessed directly.
           // System.out.println(a);
        }
    }
}