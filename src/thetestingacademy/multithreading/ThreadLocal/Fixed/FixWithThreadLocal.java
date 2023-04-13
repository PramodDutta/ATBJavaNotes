package thetestingacademy.multithreading.ThreadLocal.Fixed;

class FixWithThreadLocal {
    public static void main( String args[] ) throws Exception{
        UnsafeCounter usc = new UnsafeCounter();
        Thread[] tasks = new Thread[100];

        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(() -> {
                for (int j = 0; j < 100; j++)
                    usc.increment();
                System.out.println(usc.counter.get());
            });
            tasks[i] = t;
            t.start();
        }

        for (int i = 0; i < 100; i++) {
            tasks[i].join();
        }

        System.out.println(usc.counter.get());
    }
}

class UnsafeCounter {

    ThreadLocal<Integer> counter = ThreadLocal.withInitial(() -> 0);
    void increment() {
        counter.set(counter.get() + 1);
    }
}