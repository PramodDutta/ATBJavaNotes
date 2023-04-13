package thetestingacademy.oops.innerclasses.anonymousclass;

public class Anony04 {
    // Using Anonymous Inner class that implements an interface
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
        Thread t =new Thread(runnable);
        t.start();
        System.out.println("Main Thread");
    }
}
