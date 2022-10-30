package thetestingacademy.corejava.generics;

import java.util.List;

//public class GenericDemo<T extends Number> {
// Restrictions
public class GenericDemo<T> {

    private List<T> values;

    void add(T value) {
        values.add(value);
    }

    void remove(T value) {
        values.remove(value);
    }

    // Generic Method
    static <T extends Number> T something(T value){
        T result = value;
        // do something with
        return result;
    }
}

