package main.java.blind75.arraysAndHashing;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/top-k-frequent-elements/description/">347. Top K Frequent Elements</a>
 * <br>
 * <br>
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 */
public class TopKFrequent {
    public static void main(String[] args) {
        int[] ints = topKFrequent(new int[]{1, 1, 1, 2, 2, 3}, 2);
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

    private static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        // NOTE: if we know frequencies are unique we can use simple int[]
        // but since we can have duplicated frequencies we need a way to store all duplicates
        // that's why we use List<Integer>[] instead of simple int[]
        List<Integer>[] sortedArr = new List[nums.length + 1];
        for (int n : freqMap.keySet()) {
            int freq = freqMap.get(n);

            if (sortedArr[freq] == null) {
                sortedArr[freq] = new LinkedList<>();
            }

            sortedArr[freq].add(n);
        }

        List<Integer> res = new LinkedList<>();
        for (int i = sortedArr.length - 1; i > 0 && k > 0; --i) {
            if (sortedArr[i] != null) {
                List<Integer> list = sortedArr[i];
                res.addAll(list);
                k -= list.size();
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}
