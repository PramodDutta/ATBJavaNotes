package thetestingacademy.generics.example;

public class MaxtTheeNonGeneric {
        // determines the largest of three Comparable objects
        public static int maximum(int first, int second, int third) {
            int max = first; // assume first is initially the largest

            if (second > max) {
                max = second; // second is the largest so far
            }

            if (third > max) {
                max = third; // third is the largest now
            }
            return max; // returns the largest object
        }

        public static double maximum(double x, double y, double z) {
            double max = x; // assume x is initially the largest

            if (y > max) {
                max = y; // y is the largest so far
            }

            if (z > max) {
                max = z; // z is the largest now
            }
            return max; // returns the largest object
        }
        public static String maximum(String x, String y, String z) {
            String max = x; // assume x is initially the largest

            if (y.compareTo(max) > 0) {
                max = y; // y is the largest so far
            }

            if (z.compareTo(max) > 0) {
                max = z; // z is the largest now
            }
            return max; // returns the largest object
        }
    }
