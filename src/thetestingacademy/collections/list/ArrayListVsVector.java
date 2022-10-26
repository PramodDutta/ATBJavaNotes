package thetestingacademy.collections.list;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class ArrayListVsVector {

    public static void main(String[] args) {
        // creating an ArrayList
        ArrayList<String> al = new ArrayList<String>();

        // adding object to arraylist
        al.add("Pramod");
        al.add("Dutta");
        al.add("Lucky");
        al.add("PP");

        // traversing elements using Iterator'
        System.out.println("ArrayList elements are:");
        Iterator it = al.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        // creating Vector
        Vector<String> v = new Vector<String>();
        v.addElement("LP");
        v.addElement("PP");
        v.addElement("DP");

        // traversing elements using Enumeration
        System.out.println("\nVector elements are:");
        Enumeration e = v.elements();
        while (e.hasMoreElements())
            System.out.println(e.nextElement());
    }
}
