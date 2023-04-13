package problems.Set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SET01 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> uniqueNumbers = findUniqueElements(numbers);
        System.out.println(uniqueNumbers);
    }

    public static Set<Integer> findUniqueElements(List<Integer> inputList) {
        return new HashSet<>(inputList);
    }

}
