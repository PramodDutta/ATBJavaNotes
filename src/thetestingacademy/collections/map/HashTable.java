package thetestingacademy.collections.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTable {

    public static void main(String[] args) {
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        // Initialization of a Hashtable
        // using Generics
        Hashtable<Integer, String> ht2
                = new Hashtable<Integer, String>();

        // Inserting the Elements
        // using put() method
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");

        ht2.put(4, "four");
        ht2.put(5, "five");
        ht2.put(6, "six");

        // Print mappings to the console
        System.out.println("Mappings of ht1 : " + ht1);
        System.out.println("Mappings of ht2 : " + ht2);

        Enumeration<Integer> e = ht1.keys();

        // Iterating through the Hashtable
        // object

        // Checking for next element in Hashtable object
        // with the help of hasMoreElements() method
        while (e.hasMoreElements()) {

            // Getting the key of a particular entry
            int key = e.nextElement();

            // Print and display the Rank and Name
            System.out.println("Rank : " + key
                    + "\t\t Name : "
                    + ht1.get(key));
        }


        Set<Integer> setOfKeys = ht2.keySet();

        // Iterating through the Hashtable
        // object using for-Each loop
        for (Integer key : setOfKeys) {
            // Print and display the Rank and Name
            System.out.println("Rank : " + key
                    + "\t\t Name : "
                    + ht2.get(key));
        }


        ht2.forEach((key, value)
                -> System.out.println(
                "Rank : " + key
                        + "\t\t Name : " + value));

    }
}
