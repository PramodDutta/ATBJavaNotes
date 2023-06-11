package thetestingacademy.corejava.loops_04.dowhiledemo;

public class dw02 {
    public static void main(String[] args) {
        int i=1;
        do{
            System.out.print(i);   //  1,2,3,4,5,6,7,8,9,10,AFTER
            i++; // i = 2
        }while(i<=10); //11<10

        System.out.print("AFTER");
    }
}
