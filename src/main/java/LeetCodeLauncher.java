package main.java;

import main.java.service.GcdOfStrings1071;
import main.java.service.MergeStringsAlternately1768;
import main.java.service.RemoveDuplicatesFromSortedArray26;

public class LeetCodeLauncher {
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray26 service = new RemoveDuplicatesFromSortedArray26();

        System.out.println(service.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
