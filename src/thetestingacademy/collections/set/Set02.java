package thetestingacademy.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {

    public static void main(String[] args) {
//        Set courseSets = new HashSet();
        //ClassCastException in TreeSet
        Set courseSets = new TreeSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");
        courseSets.add(123);

        System.out.println(courseSets);
        for (Object o : courseSets) {
            System.out.println(o);
        }

        Iterator it = courseSets.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
