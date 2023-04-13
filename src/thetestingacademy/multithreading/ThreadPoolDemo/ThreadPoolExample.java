package thetestingacademy.multithreading.ThreadPoolDemo;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with 5 worker threads
        Executor executor = Executors.newFixedThreadPool(5);

        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            Runnable task = new RunnableTask("Task " + i);
            executor.execute(task);
        }

        // Shut down the thread pool
        ((ExecutorService) executor).shutdown();
    }
}

class RunnableTask implements Runnable {
    private String name;

    public RunnableTask(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Starting " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Completed " + name);
    }
}
