package thetestingacademy.exceptions;

public class Ex01 {
    // 3 PROBLEM in this problem
    public static void main(String[] args) {
        String sh = args[0];
        int x = Integer.parseInt(sh);
        int a = 10/x;
        System.out.println(x);
        System.out.println(a);
    }
}



//JVM will be Initialized
//Creates and Starts the main Thread.
//main Thread will do the following tasks
//1)Collects the Command Line Arguments
//2)Creates the String array with CLA
//3)Calls main method by passing String array as Parameter:
//Ex01.main(str);
//Now Control will be transfered from main Thread to main method
//Control will come back to main thread in two ways.
//A)When problem comes in main
//A) When Control returns abnormally with Problem then following Tasks will
//happen.
//A1)Checks Problem
//A2)Identifies the Exception class related to Problem
//A3)Creates the Object of Identified Exception class.
//ArithmeticExcetpion a=new ArithmeticExcetpion()
//A4) Throws the Exception OBject throw AE
//A5)If main method is catching the Exception thrown then controll will be
//return to main method. so that main method execution will continue.
// Main thread will terminated










// Array, NumberforMAT, Arthematic
