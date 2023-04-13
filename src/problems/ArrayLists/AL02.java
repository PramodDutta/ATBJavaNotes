package problems.ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class AL02 {
    // Common Element between Two arraysList and
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("A", "B", "C", "D"));
        List<String> list2 = new ArrayList<>(List.of("B", "D", "E", "F"));
        List<String> commonElements = findCommonElements(list1, list2);
        System.out.println(commonElements);
    }

    public static List<String> findCommonElements(List<String> list1, List<String> list2) {
        List<String> commonList = new ArrayList<>(list1);
        commonList.retainAll(list2);
        return commonList;
    }
}
