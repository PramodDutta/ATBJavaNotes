package thetestingacademy.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

    public static void main(String[] args) {

        // Arranged in order of processing
        Queue<Integer> integerQueue = new PriorityQueue<>();
        // Natural Ordering
        integerQueue.add(132);
        integerQueue.add(13);
        integerQueue.add(1);
        System.out.println(integerQueue);
        integerQueue.poll();
        System.out.println(integerQueue);

        Iterator iterator = integerQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

    }
}
