package thetestingacademy.multithreading;

public class Task04 {

    public static void main(String[] args) {

        ThreadGroup g = new ThreadGroup("Pramod");


        Worker worker = new Worker(g,"A");
        System.out.println(worker);
        //worker.setPriority(8);
        worker.start();
        // Where is the Start ?
        Worker worker2 = new Worker(g,"B");
        System.out.println(worker2);
        worker2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(i + "  -- " + Thread.currentThread().getName());
        }

    }
}
