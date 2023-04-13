package thetestingacademy.generics.example;

public class GRunner {

    public static void main(String[] args) {


        System.out.printf("Max of %d, %d and %d is %d\n\n", 23, 24, 35,
                MaxtTheeNonGeneric.maximum(23, 24, 35));
        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.1, 3.8, 4.7,
                MaxtTheeNonGeneric.maximum(6.1, 3.8, 4.7));
        System.out.printf("Max of %s, %s and %s is %s\n", "p", "a", "z",
                MaxtTheeNonGeneric.maximum("p", "z", "o"));

        // Fixed
//        System.out.printf("Max of %d, %d and %d is %d\n\n", 23, 24, 35,
//                MaxThreeGeneric.maximum(23, 24, 35));
//        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.1, 3.8, 4.7,
//                MaxThreeGeneric.maximum(6.1, 3.8, 4.7));
//        System.out.printf("Max of %s, %s and %s is %s\n", "p", "a", "z",
//                MaxThreeGeneric.maximum("p", "z", "o"));

    }
}
