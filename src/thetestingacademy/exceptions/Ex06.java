package thetestingacademy.exceptions;

public class Ex06 {
    public static void main(String[] args) {
        ProblemF problemF = new ProblemF();
        int x = problemF.show();
        System.out.println(x);
    }
}

class ProblemF{
    int a = 10;
    int show(){
        try{
//            a =  10/0;
            System.out.println("In class -> "+ a);
            return a;
        }catch (Exception e){
            System.out.println("Catch");
            a = 20;
            return a;
        }finally {
            System.out.println("I am Final");
            //int[] a1 = new int[-1]; fix it
        }
    }
}