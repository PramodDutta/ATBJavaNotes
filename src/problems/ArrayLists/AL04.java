package problems.ArrayLists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AL04 {

        public static void main(String[] args) {
            List<String> strings = new ArrayList<>(List.of("A", "B", "A", "C", "B", "C", "C"));
            Map<String, Integer> occurrences = countOccurrences(strings);
            System.out.println(occurrences);
        }

        public static Map<String, Integer> countOccurrences(List<String> inputList) {
            Map<String, Integer> countMap = new HashMap<>();
            for (String s : inputList) {
                countMap.put(s, countMap.getOrDefault(s, 0) + 1);
            }
            return countMap;
        }

}
