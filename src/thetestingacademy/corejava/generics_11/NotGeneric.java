package thetestingacademy.corejava.generics_11;

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
