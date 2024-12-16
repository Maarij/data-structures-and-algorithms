package main.java.blind75.arraysAndHashing;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/group-anagrams/description/">49. Group Anagrams</a>
 * <br>
 * <br>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 */
public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> lists = groupAnagrams2(strs);
        lists.forEach(l -> {
            l.forEach(s -> System.out.print(s + " "));
            System.out.println();
        });
    }

    // O(n∗k∗logk)
    private static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!map.containsKey(sortedWord)) {
                map.put(sortedWord, new ArrayList<>());
            }

            map.get(sortedWord).add(word);
        }

        return new ArrayList<>(map.values());
    }

    // TC: o(n*k)
    private static List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (count[i] != 0) {
                    sb.append((char) ('a' + i)).append(count[i]);
                }
            }

            groups.computeIfAbsent(sb.toString(), k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(groups.values());
    }
}
