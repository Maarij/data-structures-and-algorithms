package main.java.blind75.arraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://neetcode.io/problems/string-encode-and-decode">Encode and Decode Strings</a>
 * <br>
 * <br>
 * Design an algorithm to encode a list of strings to a single string.
 * The encoded string is then decoded back to the original list of strings.
 * <p>
 * Please implement encode and decode
 */
public class EncodeDecodeStrings {
    public static void main(String[] args) {
        String encoded = encode(Arrays.asList("neet", "code", "love", "you"));
        System.out.println(encoded);

        List<String> decoded = decode(encoded);
        decoded.forEach(s -> System.out.print(s + " "));
    }

    private static String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        List<Integer> sizes = new ArrayList<>();

        for (String str : strs) {
            sizes.add(str.length());
        }

        for (int size : sizes) {
            res.append(size).append(',');
        }

        res.append('#');

        for (String str : strs) {
            res.append(str);
        }

        return res.toString();
    }

    private static List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        int i = 0;
        while (str.charAt(i) != '#') {
            StringBuilder cur = new StringBuilder();
            while (str.charAt(i) != ',') {
                cur.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(cur.toString()));
            i++;
        }

        i++;

        for (int sz : sizes) {
            res.add(str.substring(i, i + sz));
            i += sz;
        }

        return res;
    }
}
