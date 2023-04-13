package thetestingacademy.collections.queue;

import java.util.PriorityQueue;

public class Queue02 {
    public static void main(String[] args) {
        PriorityQueue pq1 = new PriorityQueue(); //1
        // NullPointerException
        pq1.offer(10);
        pq1.offer(20);
        pq1.offer(30);
        pq1.offer(40);
        pq1.offer(50);
       // pq1.offer(null);
    }
}
