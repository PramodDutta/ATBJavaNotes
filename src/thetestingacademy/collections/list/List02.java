package thetestingacademy.collections.list;

import java.util.*;

public class List02 {
    public static void main(String[] args) {
        // ArrayList

        Collection stringList = new ArrayList<>();



        stringList.add("pramod");
        stringList.add("dutta");
        // Add with Index
        System.out.println(stringList);


        stringList.remove("Yak");
        System.out.println(stringList);


        System.out.println(" ------------");
        // Using Iterator
        Iterator iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
