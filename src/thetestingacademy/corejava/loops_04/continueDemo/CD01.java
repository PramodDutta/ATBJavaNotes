package thetestingacademy.corejava.loops_04.continueDemo;

public class CD01 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println(i);
            if(i == 5) continue;
            System.out.println("**AFTER");
        }
    }
}
