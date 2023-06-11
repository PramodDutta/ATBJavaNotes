package thetestingacademy.corejava.loops_04.switchDemo;

public class Switch01 {
    public static void main(String[] args) {
        int a=45; //
        final int X=20; // final variable, Constant
//        X = 30; // Error: cannot assign a value to final variable X
        switch(a){
            case 10+20+15: // 10+20+15
                System.out.println("CONSTANT EXPR");break;
            case 10:
                System.out.println("TEN");
            case X:
                System.out.println("TWENTY");
            case 'A':
                System.out.println("CHAR - A");
            default :
                System.out.println("DEFAULT");
                break;

        }

        System.out.println("END");
    }
}
