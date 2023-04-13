package thetestingacademy.problem.arraysproblem;

import java.util.*;

public class SumTwoNumberEqual {

    public static void main(String[] args) {

        /**
        arr = {1,21,3,14,5,60,7,6};
        value = 81;
         arr = {21,60};
         **/
       findSum();
    }
    static void findSum(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Integer[] arr = {1,21,3,14,5,60,7,6};
        Integer value = 81;
        HashMap<Integer, Boolean> hashMap = new HashMap<>();
        for (Integer i = 0; i < arr.length ; i++) {
            hashMap.put(value-arr[i],true);
        }
        for (Integer i = 0; i < arr.length ; i++) {
            if(hashMap.containsKey(arr[i])){
                arrayList.add(arr[i]);
            }
        }
        System.out.println(arrayList);
    }
}
