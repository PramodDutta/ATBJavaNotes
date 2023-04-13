package thetestingacademy.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Queue01 {

    public static void main(String[] args) {

        ATBStudent s1 = new ATBStudent(1,"Pramod","ATB");
        ATBStudent s2 = new ATBStudent(2,"Prajeeth","ATB");

        PriorityQueue<ATBStudent> q1 =  new PriorityQueue<>();
        q1.add(s1);
        q1.add(s2);
        //ATBStudent s = q1.peek();
        //System.out.println(s);

       ATBStudent st2 = q1.poll(); // Remove
        System.out.println(st2);


        System.out.println(q1);





        PriorityQueue queue = new PriorityQueue();
        queue.add(50);
        queue.add(20);
        queue.add(10);
        queue.add(80);
        queue.add(60);
        queue.add(70);
        queue.add(30);
        queue.add(40);
        System.out.println(queue);
        System.out.println("------");


        Iterator it = queue.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


        System.out.println("------");
        for (Object obj : queue) {
            System.out.println(obj);
        }

        System.out.println(queue.offer(99));
        System.out.println(queue.offer(99));
        System.out.println(queue.offer(88));
        // ClassCastException
        //System.out.println(queue.offer("OK"));
        System.out.println(" --- --  -- -- ");
        for (Object obj : queue) {
            System.out.println(obj);
        }
    }
}
