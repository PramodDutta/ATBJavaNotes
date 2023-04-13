package thetestingacademy.multithreading.synchronization;

public class Sync02 {
    public static void main(String[] args) {

        Case1 t1 = new Case1("A");
        t1.start();

        Case1 t2 = new Case1("B");
        t2.start();

    }
}

/**
 * Q1) Any Chance to get Inconsistent Results in this case?
 * Ans: NO
 * Q2) Threads will run concurrently or not?
 * Ans: Yes, will run concurrently
 *
 * */
class Case1 extends Thread{

    public Case1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" -> "+Thread.currentThread().getName());
        }
    }

    void m1(){
        System.out.println("m1()");
    }
    void m2(){
        System.out.println("m2()");
    }

}