package thetestingacademy.problem.arraysproblem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateArray {

    public static void main(String[] args) {

//        int arr[] = {1, 3, 4, 3, 5, 4, 100, 100};
//        Out {3, 4, 100};

        Integer[] arrays = {1, 3, 4, 3, 5, 4, 100, 100};
        ArrayList outputs = new ArrayList();
        Integer counter = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arrays.length; i++) {
            if (hashMap.containsKey(arrays[i])) {
                counter = hashMap.get(arrays[i]);
                hashMap.put(arrays[i], counter + 1);
            } else {
                hashMap.put(arrays[i], 1);
            }
        }

        System.out.println(hashMap);

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                outputs.add(entry.getKey());
            }
        }
        System.out.println(outputs);
    }
}
