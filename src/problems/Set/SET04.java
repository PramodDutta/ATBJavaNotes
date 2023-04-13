package problems.Set;

import java.util.HashSet;
import java.util.Set;

public class SET04 {
    // Distinct Character
    public static void main(String[] args) {
        String input = "programming";
        Set<Character> distinctChars = distinctCharacters(input);
        System.out.println(distinctChars);
    }

    public static Set<Character> distinctCharacters(String input) {
        Set<Character> resultSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            resultSet.add(c);
        }
        return resultSet;
    }
}
