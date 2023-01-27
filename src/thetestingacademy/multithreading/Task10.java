package thetestingacademy.multithreading;

public class Task09 {
    //  Thread Group and Name

    public static void main(String[] args) {
        System.out.println("Main Begin");
        Thread th = Thread.currentThread();
        th.setPriority(1);
        ThreadGroup ttaGroup = new ThreadGroup("TTA");
        MyWorkerS myth1 = new MyWorkerS(ttaGroup, "A");
        myth1.setPriority(2); // 1 to 10
        myth1.start();
        MyWorkerS myth2 = new MyWorkerS(ttaGroup, "B");
        myth2.setPriority(4);
        myth2.start();
        MyWorkerS myth3 = new MyWorkerS(ttaGroup, "C");
        myth3.setPriority(6);
        myth3.start();
        MyWorkerS myth4 = new MyWorkerS("D");
        myth4.setPriority(9);
        //myth4.setPriority(99);
        myth4.start();
        MyWorkerS myth5 = new MyWorkerS();
        myth5.setPriority(7);
        myth5.start();
        System.out.println(myth1);
        System.out.println(myth2);
        System.out.println(myth3);
        System.out.println(myth4);
        System.out.println(myth5);
        System.out.println(th);
    }
}


class MyWorkerS extends Thread {

    public MyWorkerS() {
    }

    public MyWorkerS(ThreadGroup group, String name) {
        super(group, name);
    }

    public MyWorkerS(String d) {
        super(d);
    }

    public void run() {
        Thread th = Thread.currentThread();
        for (int i = 1; i <= 5; i++) {
            System.out.println(" I am " + th.getName());
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    } //end of run()
}
