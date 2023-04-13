package thetestingacademy.collections.list;

import java.util.ArrayList;
import java.util.List;

public class List05 {
    public static void main(String[] args) {
        List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("Java for Testers");

        List numList = new ArrayList();
        numList.add(150);
        numList.add(100);
        numList.add(100);
        numList.add(399);

        ttacourseList.add(3, "SQL");
        System.out.println(ttacourseList);
        //ttacourseList.remove("Hello");
        System.out.println(ttacourseList.remove(5));
        System.out.println(ttacourseList.remove(4));
        System.out.println(ttacourseList);
        //ttacourseList.add(10,"MS");
        //ttacourseList.remove(10);

        // Index Of, Last index Of and Set method
        System.out.println(ttacourseList.indexOf("ATB"));
        System.out.println(ttacourseList.indexOf("MTB"));
        System.out.println(ttacourseList.lastIndexOf("SQL"));
        System.out.println(ttacourseList.indexOf("DSA"));
        System.out.println(ttacourseList);
        ttacourseList.set(3,"Java 19");
        System.out.println(ttacourseList);



        // Sublist
        List mylist1=ttacourseList.subList(2,4);
        System.out.println(mylist1);
    }
}
