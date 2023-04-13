package thetestingacademy.generics.example;

public class MaxThreeGeneric {
    // determines the largest of three Comparable objects
    public static < T extends Comparable < T >> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // y is the largest so far
        }

        if (z.compareTo(max) > 0) {
            max = z; // z is the largest now
        }
        return max; // returns the largest object
    }
}
