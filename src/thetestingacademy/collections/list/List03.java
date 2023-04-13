package thetestingacademy.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class List03 {

    // For Each vs Iterators
    //elements.forEach (e -> System.out.println(e) );
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<Integer>();
        // Now add elements to the Link List
        l.add(2);
        l.add(3);
        l.add(4);

        // 2,3,4,5

        Iterator iterator = l.iterator();
        while (iterator.hasNext()){ //t,t,t,f
            //l.add(5); Not possible
            System.out.println(iterator.next()); //2,3,4
        }


        //l.forEach (e -> System.out.println(e) );


    }
}
