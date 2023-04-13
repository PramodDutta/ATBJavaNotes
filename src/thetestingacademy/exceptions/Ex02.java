package thetestingacademy.exceptions;

import java.io.FileInputStream;

public class Ex02 {

    public static void main(String[] args) {
        try {
            String name = null;
            name.trim();
        }catch (Exception e){
//        }catch (Throwable e){
//        }catch (Error e){
            e.printStackTrace();
        }
        System.out.println("I am done");



        //Checked Exception , Compile Time
        //FileInputStream f = new FileInputStream("dasda");

        //Unchecked Exception , Runtime
        //String s = null;
        //s.trim(); // Unchecked? Runtime

        // Compile time ERROR vs Exception
    }
}
