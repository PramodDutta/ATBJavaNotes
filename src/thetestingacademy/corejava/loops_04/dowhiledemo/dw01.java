package thetestingacademy.corejava.loops_04.dowhiledemo;

public class dw01 {
    public static void main(String[] args) {
        int a=0;
        // While -> Condition -> Body -> Increment
        // Do While -> Body -> Condition -> Increment

        do{
            System.out.println("Value of a:"+a);
            a--;
            break;
        }while(a>20);
    }
}
