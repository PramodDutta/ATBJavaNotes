package leetcode.Array;

import java.util.Arrays;

public class LC1480 {
    public static void main(String[] args) {
        Solution1480 s = new Solution1480();
        int[] ar = {1,2,3,4};
        System.out.println(Arrays.toString(s.runningSum(ar)));
    }
}

class Solution1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                nums[i] = nums[j]+nums[j+1];  //
            }
        }
        return nums;
    }
}
