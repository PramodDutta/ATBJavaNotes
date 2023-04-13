package problems.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class AL05 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 2, 4, 5, 2));
        int valueToRemove = 2;
        removeAllOccurrences(numbers, valueToRemove);
        System.out.println(numbers);
    }

    public static void removeAllOccurrences(List<Integer> inputList, int value) {
        inputList.removeIf(n -> n == value);
    }
}
