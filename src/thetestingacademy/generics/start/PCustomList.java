package thetestingacademy.generics.start;

import java.util.ArrayList;
import java.util.List;

public class PCustomList<T> {

    ArrayList<T> mylist  = new ArrayList<>();

    void add(T obj){
        mylist.add(obj);
    }

    void remove(T obj){
        mylist.remove(obj);
    }

    void printList(){
        System.out.println(mylist.toString());
    }
}
