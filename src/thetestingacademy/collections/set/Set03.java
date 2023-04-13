package thetestingacademy.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class Set03 {

    public static void main(String[] args) {

        TreeSet numSet = new TreeSet(); //1
        numSet.add(50);
        numSet.add(20);
        numSet.add(10);
        numSet.add(80);
        numSet.add(60);
        numSet.add(70);
        numSet.add(30);
        numSet.add(40);
        System.out.println(numSet);
        System.out.println(numSet.first());
        System.out.println(numSet.last());
        System.out.println(numSet);
        System.out.println(numSet.lower(50));
        System.out.println(numSet.higher(60));
        System.out.println(numSet);
        System.out.println(numSet.floor(50));
        System.out.println(numSet.ceiling(60));
        System.out.println(numSet);
        System.out.println(numSet.pollFirst());
        System.out.println(numSet.pollLast());
        System.out.println(numSet);

// Subset
        Set myset1= numSet.subSet(20,60);
        System.out.println(myset1);

        Set myset2= numSet.subSet(20,true,60,false);
        System.out.println(myset2);
    }
}
