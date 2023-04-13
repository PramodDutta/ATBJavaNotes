package thetestingacademy.multithreading;

public class Task02 {
    public static void main(String[] args) throws InterruptedException {

        Thread t = Thread.currentThread();
        System.out.println(t);
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" - "+t.getName());
            Thread.sleep(5000);
            // Who is creating this Thread?
            // JVM
        }
    }
}
