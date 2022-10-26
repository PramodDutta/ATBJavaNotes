package thetestingacademy.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List01 {
    public static void main(String[] args) {
        // ArrayList

        List stringList = new ArrayList<>();
        stringList.add("pramod");
        stringList.add("dutta");
        // Add with Index
        stringList.add(2,"lucky");
        System.out.println(stringList);

        stringList.set(0,"Yak");
        System.out.println(stringList);

        stringList.remove("Yak");
        System.out.println(stringList);


        // Iterate over
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }

        System.out.println(" \n");
        //
        for (Object s:stringList) {
            System.out.println(s);
        }

        System.out.println(" ------------");
        // Using Iterator
        Iterator iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
