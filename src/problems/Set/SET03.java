package problems.Set;

import java.util.HashSet;
import java.util.Set;

public class SET03 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>(Set.of("A", "B", "C", "D"));
        Set<String> set2 = new HashSet<>(Set.of("B", "D", "E", "F"));
        Set<String> intersectionSet = findIntersection(set1, set2);
        System.out.println(intersectionSet);
    }

    public static Set<String> findIntersection(Set<String> set1, Set<String> set2) {
        Set<String> resultSet = new HashSet<>(set1);
        resultSet.retainAll(set2);
        return resultSet;
    }
}
