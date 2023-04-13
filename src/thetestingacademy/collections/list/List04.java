package thetestingacademy.collections.list;

import java.util.ArrayList;
import java.util.List;

public class List04 {
    public static void main(String[] args) {
        List courseList = new ArrayList();
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("LAPIT");
        courseList.add("SDET Blueprint");
        courseList.add("Java for Testers");

        List numList = new ArrayList();
        numList .add(150);
        numList .add(100);
        numList .add(100);
        numList .add(399);

        // add vs addAll
        //courseList.add(numList);
        courseList.addAll(numList);
        boolean b1=courseList.contains(numList);
        System.out.println(courseList);
        System.out.println(b1);


        // Remove and RetainAll
        //courseList.removeAll(numList);
        courseList.retainAll(numList);
        System.out.println(courseList);
    }
}
