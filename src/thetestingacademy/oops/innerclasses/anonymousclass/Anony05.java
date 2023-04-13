package thetestingacademy.oops.innerclasses.anonymousclass;

public class Anony05 {
    public static void main(String[] args) {
       // Using Anonymous Inner class that extends a Class
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Child");
            }
        });
        thread.start();
        System.out.println("Main");


    }
}
