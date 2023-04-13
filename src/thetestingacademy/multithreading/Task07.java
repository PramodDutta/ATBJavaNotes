package thetestingacademy.multithreading;
// Runnable
public class Task07 {

    public static void main(String[] args) {

        Runnable w1 = new workerRun7();
        Thread t1 = new Thread(w1,"W7_A");
        t1.start();

        workerRun7 w2 = new workerRun7();
        Thread t2 = new Thread(w2,"W7_B");
        t2.start();


        for (int i = 0; i < 10; i++) {
            System.out.println(i + "  -- " + Thread.currentThread().getName());
        }

    }
}

class workerRun7 implements Runnable{



    @Override
    public void run() {
        for (int i = 0; i < 10 ; i++) {
            System.out.println( i + " --> " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
