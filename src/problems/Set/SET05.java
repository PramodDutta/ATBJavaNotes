package problems.Set;

import java.util.HashSet;
import java.util.Set;

public class SET05 {
    //Check if the first set is a subset of the second set
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        boolean isSubset = isSubset(set1, set2);
        System.out.println("Set1 is a subset of Set2: " + isSubset);
    }

    public static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
        return set2.containsAll(set1);
    }
}
