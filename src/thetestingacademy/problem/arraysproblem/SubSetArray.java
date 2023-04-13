package thetestingacademy.problem.arraysproblem;

import java.util.HashSet;

public class SubSetArray {
    public static void main(String[] args) {

        int[] arr1 = {9,4,7,1,-2,6,5};
        int[] arr2 = {7,1,-2};
        System.out.println(isSubset(arr1,arr2));

    }

    static boolean isSubset(int arr1[], int arr2[])
    {
        HashSet<Integer> hset= new HashSet<>();
        HashSet<Integer> hset2= new HashSet<>();
        // hset stores all the values of arr1
        for(int i = 0; i < arr1.length; i++)
        {
            if(!hset.contains(arr1[i]))
                hset.add(arr1[i]);
        }

        // loop to check if all elements of arr2 also
        // lies in arr1
        for(int i = 0; i < arr2.length; i++)
        {
            if(!hset.contains(arr2[i])){
                return false;
            }
            hset2.add(arr2[i]);
        }
        System.out.println(hset2);
        return true;
    }
}
