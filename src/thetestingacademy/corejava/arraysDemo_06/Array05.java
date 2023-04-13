package thetestingacademy.corejava.arraysDemo_06;

public class Array05 {
    public static void main(String[] args) {

        //Print the Main Diagonal of n * n Matrix
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j)
                    System.out.print(mat[i][j] + "\t");
            }
        }


        // O(n) solution
        //for (int i = 0; i < mat.length; i++) {
        //System.out.print(mat[i][i] + "\t");
        //}

    }
}
