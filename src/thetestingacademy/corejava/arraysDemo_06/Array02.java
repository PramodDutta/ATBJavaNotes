package thetestingacademy.corejava.arraysDemo_06;

public class Array02 {
    public static void main(String[] args) {
        // 2D array
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        // Row and Columns
        // 3 Rows and 3 Columns
        // -> 123
          // -> 456
            // -> 789


        //print arr1

        int arr[][] = new int[3][4];
        int rows = arr.length;
        System.out.println("Rows : "+rows);
        int r1size = arr[0].length;
        System.out.println("Row 1 Size : "+ r1size);
        int r2size = arr[1].length;
        System.out.println("Row 2 Size : "+ r2size);
        int r3size = arr[2].length;
        System.out.println("Row 3 Size : "+ r3size);
        for(int i=0;i<rows;i++) {
            System.out.println(arr[i]);
        }

    }
}
