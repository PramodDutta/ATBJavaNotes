package thetestingacademy.corejava.loops_04.whiledemo;

public class while01 {
    public static void main(String[] args) {

        int i=1;
        while(i<=10){ // Exit Condition
            System.out.println(i); // Code You want to execute // 1
            if(i > 2){
                break;
            }else{
                i++;
            }
        }

    }
}
