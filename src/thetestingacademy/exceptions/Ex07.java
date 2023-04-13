package thetestingacademy.exceptions;

public class Ex07 {
    public static void main(String[] args) {
        try{
            int a = 0; // 1
//            int a = 10;
            int x = 10/a;
        }catch (Exception e){
            System.out.println("Exit");
            System.exit(0);
        }finally {
            // Write the code which you want 100% to be executed!
            // database close
            // webdrive close. file close and IO clode, scanner close
            System.out.println("I am final");
        }
    }
}
