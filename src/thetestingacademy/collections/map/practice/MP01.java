package thetestingacademy.collections.map.practice;

import java.util.*;

public class MP01 {
    public static void main(String[] args) {

        // Map map = new Map(); // Interface can't have an Object
        Map<Integer,Object> map = new TreeMap();
        map.put(32,1);
        map.put(21,"Pramod");
        map.put(67,32);
        //map.put(null,null);


        // id,name, add, "", null - Set Unique values as List
        for(Map.Entry<Integer,Object> e: map.entrySet()){
            System.out.println(e.getKey() + " --> " + e.getValue());
        }









        // High -> Hashmap will take care of element that you are entering
        //

        //10 -> 9th -> 1, , 2 or 15



        // 10 - ["ID]["NAME"]["AGE]["ADD"] ["null"] [] [][][][][][]



    }
}
