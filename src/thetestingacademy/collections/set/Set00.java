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
        fruits.add("Pak");
        System.out.println(fruits);

        // No order maintained
        // No duplicate value
        // ??

    }
}
