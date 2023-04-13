package thetestingacademy.multithreading;

public class Task10 {
    //  Thread Group and Name

    public static void main(String[] args) throws
            Exception{
        System.out.println("Main Begin");
        MyWorker10 th1= new MyWorker10();
        th1.start();
        System.out.println(th1.getState());
        Thread.sleep(1000);
        System.out.println(th1.getState());
        Thread.sleep(1000);
        System.out.println(th1.getState());
    }
}


class MyWorker10 extends Thread {



    public void run() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(" I am " + th.getName() + " \t "+th.getState());
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    } //end of run()
}
