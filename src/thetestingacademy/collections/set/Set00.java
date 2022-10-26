package thetestingacademy.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set00 {

    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Yak");
        fruits.add("Pak");
        System.out.println(fruits);

        // Iterating over hashSet items
        Iterator<String> i = fruits.iterator();

        // Holds true till there is single element remaining
        while (i.hasNext())

            // Iterating over elements
            // using next() method
            System.out.println(i.next());
    }
}
