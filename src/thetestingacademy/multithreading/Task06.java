package thetestingacademy.multithreading;

public class Task06 {
    public static void main(String[] args) {

        // Constructor with Name
        Worker6 worker = new Worker6("W1");
        worker.start();
        // Where is the Start ?
        Worker6 worker2 = new Worker6("W2");
        worker2.start();

    }
}

class Worker6 extends Thread{
    // Constructor with Name
    Worker6(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(i  + " --> "+ Thread.currentThread().getName());
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
