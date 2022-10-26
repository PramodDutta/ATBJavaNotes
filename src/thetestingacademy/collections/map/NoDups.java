package thetestingacademy.collections.map;

import java.util.HashMap;
import java.util.Map;

public class NoDups {
    public static void main(String args[]){
        HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(1,"Grapes"); //trying duplicate key

        //hm.putIfAbsent(103, "Gaurav");
        // Remove map.remove(100);
        //value-based removal
        // map.remove(101);
        ////key-value pair based removal
        //    map.remove(102, "Rahul");

        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
