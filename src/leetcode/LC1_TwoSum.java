package leetcode;

import java.util.Scanner;

public class LC1_TwoSum {
    public static void main(String[] args) {

        int [] a = {3,2,4};
        int target = 6;
        for (int i = 0; i <  a.length; i++) {
            if(a[i]+ a[i+1] == target){
                System.out.println(a[i]);
                System.out.println(a[i+1]);
            }
        }




    }
}
