package thetestingacademy.practice.problem01;

public class RunnerClass {
    public static void main(String[] args) {

        PrintMyBook p = new PrintMyBook("Harry", "JK",100);
        Book p2 = new PrintMyBook("Pramod", "JKW",200);
        p.getDetails();
        p2.getDetails();


    }
}
