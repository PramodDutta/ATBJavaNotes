package thetestingacademy.corejava.loops_04.dowhiledemo;

public class dw01 {
    public static void main(String[] args) {
        int a=0;
        // While -> Condition -> Body -> Increment
        // Do While -> Body -> Condition -> Increment

        do{
            System.out.println("Value of a: "+a); // a = 0
            a--; //a = -1
            //break;
        }while(a>-5);


    }
}
