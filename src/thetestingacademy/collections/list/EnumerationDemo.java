package thetestingacademy.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args)
    {
        // Creating a vector object
        // Dynamic Arrays
        //  No fix, can store multiple type of elements
        // Syncronized

        Vector v = new Vector();

        Vector<String> v2 = new Vector();
        v2.add("pramod");
        v2.add("pr");
        v2.add("adsda"); // Array - can store simirlar only

//        Integer[] a= new Integer[10];
//        a[0] = "pramod";

        //A vector is a resizable array, also known as a dynamic array
        // grow and shrink - size are working values.
        // Synchronized


        // Iterating over vector object
        for (int i = 0; i < 10; i++)
            v.addElement(i);


        // 0-9









        // Printing elements in vector object
        System.out.println(v);

        // At beginning e(cursor) will point to
        // index just before the first element in v
        Enumeration e = v.elements();

        // Checking the next element availability where
        // condition holds true till there is a single element
        // remaining in the List
        while (e.hasMoreElements())
        {
            // Moving cursor to next element
            int i = (Integer)e.nextElement();

            // Print above elements in object
            System.out.print(i + " ");
        }
    }
}
