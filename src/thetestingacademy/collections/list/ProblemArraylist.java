package thetestingacademy.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ProblemArraylist {

    // print all words end with the ble
    //{ able, capable, maple, ragable}
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("able");
        list.add("capable");
        list.add("maple");
        list.add("ragable");

        //Logic Building
        // Can I do with contains?
        // String then ?
        // Traditional for loop, while loops

        ArrayList<String> newList = new ArrayList();

        for (String o:list) {
            if(!o.endsWith("able")){
                System.out.println(o);
            }
        }


        // Contains- exact -> match
        // Not all the functions good for List

        // 1. Can i USE THE coLLECTION FRAMEWORK Methods?
        // 2. cAN i USE THE DEFAULT METHODS OF WRAPPER CLASSES OR Strings
        // 2. Traditonal Forloop and if or while loop



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
        list.add("apable");
        list.add("maple");
        list.add("ragable");

        List<Integer> myMakrs = new ArrayList<>();
        myMakrs.add(91);
        myMakrs.add(87);
        myMakrs.add(80);
        Collections.sort(myMakrs);
        System.out.println(myMakrs);


        Collections.sort(list);
        System.out.println(list);


    }
}
