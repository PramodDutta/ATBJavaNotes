package thetestingacademy.multithreading;
// Runnable
public class Task05 {

    public static void main(String[] args) {
        Runnable w1 = new workerRun();
        Thread t1 = new Thread(w1);
        t1.start();

        workerRun w2 = new workerRun();
        Thread t2 = new Thread(w2);
        t2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "  -- " + Thread.currentThread().getName());
        }

    }
}

class workerRun implements Runnable{

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
