package thetestingacademy.corejava.generics;

import java.util.List;

public class NotGeneric {

    private List<String> values;

    void add(String value){
        values.add(value);
    }

    void remove(String value){
        values.remove(value);
    }


}
