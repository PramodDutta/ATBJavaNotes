package thetestingacademy.oops.innerclasses.anonymousclass;

public class Anony03 {

    // Using Anonymous Inner class that extends a Class
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println("Hello Child Thread");
            }
        };
        thread.start();
        System.out.println("Main Thread");
    }
}
