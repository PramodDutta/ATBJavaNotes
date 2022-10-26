package thetestingacademy.multithreading;

public class MainClas {
    public static void main(String[] args) throws InterruptedException {
       SumOneThread();
       TwoThread();
    }

    static void SumOneThread() {
        long start = System.currentTimeMillis();
        long Max = Integer.MAX_VALUE;
        long sum=0;
        sum(0,Max);
        long end = System.currentTimeMillis();
        System.out.println("Single thread final count = "  + " took " + (end - start));

    }


    static long sum(long start, long end){

        int sum = 0;
        for (long i = start; i < end ; i++) {
            sum +=i;
        }
          return sum;
        }

    static void TwoThread() throws InterruptedException {
        long start = System.currentTimeMillis();
        long N  = Integer.MAX_VALUE;
        long S1 = 0;
        long S2  = N/2+1;

        Thread t1 = new Thread(() -> {
            sum(S1,N/2);
        });

        Thread t2 = new Thread(() -> {
            sum(S2,N);
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        long end = System.currentTimeMillis();
        System.out.println("Two thread final count = "  + " took " + (end - start));



    }

}


