package leetcode.String;

public class LC1108 {

    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(new Solution1108().defangIPaddr(address));
    }
}


class Solution1108 {
    public String defangIPaddr(String address) {
            return address.replace(".","[.]");

    }
}