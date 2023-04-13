package problems.Set;

import java.util.HashSet;
import java.util.Set;

public class SET02 {

        public static void main(String[] args) {
            Set<Integer> set1 = new HashSet<>(Set.of(1, 2, 3, 4));
            Set<Integer> set2 = new HashSet<>(Set.of(3, 4, 5, 6));
            Set<Integer> unionSet = findUnion(set1, set2);
            System.out.println(unionSet);
        }

        public static Set<Integer> findUnion(Set<Integer> set1, Set<Integer> set2) {
            Set<Integer> resultSet = new HashSet<>(set1);
            resultSet.addAll(set2);
            return resultSet;
        }

}
