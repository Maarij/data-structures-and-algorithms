package main.java.hackerrank.threemonth.week1;

import java.util.*;

public class P7SparseArrays {
    public static void main(String[] args) {
        matchingStrings(Arrays.asList("ab", "ab", "abc"), Arrays.asList("ab", "abc", "bc"));
    }

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> matches = new ArrayList<>();

        if (strings.isEmpty() || queries.isEmpty()) {
            return matches;
        }

        Map<String, Integer> stringOccurrences = new HashMap<>();
        for (String s : strings) {
            if (stringOccurrences.containsKey(s)) {
                stringOccurrences.put(s, stringOccurrences.get(s) + 1);
            } else {
                stringOccurrences.put(s, 1);
            }
        }

        for (String q : queries) {
            matches.add(stringOccurrences.getOrDefault(q, 0));
        }

        return matches;
    }
}
