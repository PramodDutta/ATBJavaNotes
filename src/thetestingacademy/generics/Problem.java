package thetestingacademy.generics;

public class Problem {

    // Max array make it generic for int, doubt, float,, long



    public static void main(String[] args) {
        FindMax findMax = new FindMax();
        Integer[] inputs1 = {2,8,20,3,4};
        Double[] inputs2 = {2.7,3.8,5.5,6.7,9.7};
        System.out.println(findMax.array_max(inputs1,5));
        System.out.println(findMax.array_max(inputs2,5));
    }
}

class FindMax {
    public static < T extends Comparable < T >> T array_max(T data[], int n) {
        T max = data[0];
        int i;
        for (i = 1; i < n; i++) {
            if (max.compareTo(data[i]) < 0) {
                max = data[i];
            }
        }
        return max;
    }
}