package thetestingacademy.multithreading.ThreadLocal;

class UnSafeDemo {
    public static void main( String args[] ) throws Exception{

        UnsafeCounter usc = new UnsafeCounter();
        Thread[] tasks = new Thread[100];

        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(() -> {
//                try {
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
                for (int j = 0; j < 100; j++)
                    usc.increment();
            });
            tasks[i] = t;
            t.start();
        }

        for (int i = 0; i < 100; i++) {
            tasks[i].join();
        }

        System.out.println(usc.count);
    }
}

class UnsafeCounter {

    // Instance variable
    int count = 0;

    void increment() {
        count = count + 1;
    }
}
