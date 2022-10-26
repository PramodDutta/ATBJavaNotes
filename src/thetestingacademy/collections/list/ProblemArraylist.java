package thetestingacademy.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ProblemArraylist {

    // print all words end with the ble
    //{ able, capable, maple, ragable}
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("able");
        list.add("capable");
        list.add("maple");
        list.add("ragable");

        ArrayList<String> newList = new ArrayList();

        for (String o:list) {
            if(!o.endsWith("able")){
                System.out.println(o);
            }
        }
        // Remove all words end with the ble
        //{ able, capable, maple, ragable}

// Error Self work
//        for (String o:list) {
//            if(!o.endsWith("able")){
//                list.remove(o);
//            }
//        }

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            if(iterator.next().endsWith("able")){
                iterator.remove();
            }
        }
        System.out.println(list);

        list.add("capable");
        list.add("maple");
        list.add("ragable");
        Collections.sort(list);
        System.out.println(list);
    }
}
