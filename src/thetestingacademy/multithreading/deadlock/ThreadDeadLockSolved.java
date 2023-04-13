package thetestingacademy.multithreading.deadlock;

public class ThreadDeadLockSolved {

    public static void main(String ar[]) {
        ThreadDeadLockSolved tdSolution = new ThreadDeadLockSolved();

        final Resource1 a = tdSolution.new Resource1();
        final Resource2 b = tdSolution.new Resource2();

        // Thread-1
        Runnable b1 = new Runnable() {
            public void run() {
                synchronized (b) {
                    try {
                        /* Adding delay so that both threads can start trying to lock resources */
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Thread-1 have resource1 but need resource2 also
                    synchronized (a) {
                        System.out.println("In block 1");
                    }
                }
            }
        };

// Thread-2
        Runnable b2 = new Runnable() {
            public void run() {
                synchronized (b) {
                    // Thread-2 have resource2 but need resource1 also
                    synchronized (a) {
                        System.out.println("In block 2");
                    }
                }
            }
        };


        new Thread(b1).start();
        new Thread(b2).start();
    }

    // resource1
    private class Resource1 {
        private int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    // resource2
    private class Resource2 {
        private int i = 20;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}
