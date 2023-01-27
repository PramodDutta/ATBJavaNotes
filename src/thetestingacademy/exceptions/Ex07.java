package thetestingacademy.exceptions;

public class Ex07 {
    public static void main(String[] args) {
        try{
            int a = 0;
//            int a = 10;
            int x = 10/a;
        }catch (Exception e){
            System.out.println("Exit");
            System.exit(0);
        }finally {
            System.out.println("I am final");
        }
    }
}
