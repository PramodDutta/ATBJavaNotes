package thetestingacademy.multithreading.synchronization.WaitDemo;

public class WaitDemo {

    public static void main(String[] args) {

        WaitForMe waitForMe = new WaitForMe();

        CustomThread customThread = new CustomThread(waitForMe, "A");
        CustomThread customThread2 = new CustomThread(waitForMe, "B");

        customThread.start();
        customThread2.start();
    }
}


class WaitForMe {

    //    synchronized void show(){
    synchronized void show() {
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(" Name -> " + thread.getName() + " -> " + i);
            try {
                this.wait(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Blocking a Block or Third Party Object
//    void show() {
//        Thread th = Thread.currentThread();
//        ArrayList al = new ArrayList();
//        synchronized (al) {
//            for (int i = 1; i <= 5; i++) {
//                System.out.println(th.getName() + " - show -" + i);
//                try {
////this.wait(1000);
//                    al.wait(1000);
//                } catch (Exception ex) {
//                    System.out.println(ex);
//                }
//            }
//        }
//    }
}



class CustomThread extends Thread {
    WaitForMe wait;

    public CustomThread(WaitForMe wait, String name) {
        super(name);
        this.wait = wait;
    }

    @Override
    public void run() {
        wait.show();
    }
}