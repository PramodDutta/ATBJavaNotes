package thetestingacademy.corejava.arraysDemo_06;

public class Array01 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5}; //0x01-05
        int[] arr2 = {1,2,3,4,5}; //0x06-0A
        int[] arr3 = arr1;
        System.out.println(arr1==arr2);
        System.out.println(arr1==arr3);
        System.out.println(arr2==arr3);



        System.out.println(arr1.equals(arr2));
        System.out.println(arr1.equals(arr3));
        System.out.println(arr2.equals(arr3));






    }
}
