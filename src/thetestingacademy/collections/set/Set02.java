package thetestingacademy.collections.set;

import java.util.*;

public class Set01 {

    public static void main(String[] args) {
        Set courseSets = new HashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

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
