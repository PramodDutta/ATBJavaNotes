package leetcode.String;

import java.util.Arrays;

public class LC344 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] s = {'H','a','n','n','a','h'};
        // hannaH
        //solution.reverseString(s);
        reverseString2(s);
    }

    static void reverseString2(char[] c){
        int start = 0;
        int end = c.length-1;
        while(start < end){
            char temp = c[start];
            c[start] =c[end];
            c[end] = temp;
            start++;
            end--;
        }
        System.out.println(c);
    }

}






class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s) {
            sb.append(c);
        }
        sb.reverse();
        String [] temp = new String[s.length];
        for (int i = 0; i < sb.length(); i++) {
                temp[i] = String.valueOf(sb.charAt(i))+"";
        }
        System.out.println(Arrays.toString(temp));
    }
}
