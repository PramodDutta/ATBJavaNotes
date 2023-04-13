package problems.ArrayLists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class AL01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Pramod Dutta");
        list.add("Lucky");
        list.add("Dutta");
        list.add("Amod");
        list.add("Love");
        list.add("Anuj");
        list.add("Dutta");
        list.add("Pramod Dutta");

        Set<String> s = new HashSet<String>();

        for(String name : list) {
            if(s.add(name) == false)
                System.out.println(name + " - is duplicated");
        }



    }
}
