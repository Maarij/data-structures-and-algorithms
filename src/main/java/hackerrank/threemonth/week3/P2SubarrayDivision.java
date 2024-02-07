package main.java.hackerrank.threemonth.week3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class P2SubarrayDivision {
    public static void main(String[] args) {
//        System.out.println(birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2));
        System.out.println(birthday(Arrays.asList(4, 5, 4, 5, 1, 2, 1, 4, 3, 2, 4, 4, 3, 5, 2, 2, 5, 4, 3, 2, 3, 5, 2, 1, 5, 2, 3, 1, 2, 3, 3, 1, 2, 5), 18, 6));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;

        List<Integer> queue = new LinkedList<>();
        int currentSum = 0;

        for (int i = 0; i < s.size(); i++) {
            if (queue.isEmpty() || queue.size() < m) {
                queue.add(s.get(i));
                currentSum = currentSum + s.get(i);

                if (queue.size() == m && currentSum == d) {
                    count++;
                }
            } else if (queue.size() == m) {
                Integer remove = queue.remove(0);
                queue.add(s.get(i));

                currentSum = currentSum - remove + s.get(i);

                if (currentSum == d) {
                    count++;
                }
            }
        }

        return count;
    }
}
