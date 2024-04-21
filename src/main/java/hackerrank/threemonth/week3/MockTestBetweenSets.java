package main.java.hackerrank.threemonth.week3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MockTestBetweenSets {

    public static void main(String[] args) {
        System.out.println(getTotalX(Arrays.asList(2,6), Arrays.asList(24,36)));
    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        Collections.sort(a);
        Collections.sort(b);

        List<Integer> possibilities = new ArrayList<>();

        for (int i = a.get(a.size()-1); i <= b.get(0); i++) {
            boolean aPass = true;
            for (int aInt : a) {
                if (i % aInt != 0) {
                    aPass = false;
                    break;
                }
            }

            boolean bPass = true;
            for (int bInt : b) {
                if (bInt % i != 0) {
                    bPass = false;
                    break;
                }
            }

            if (aPass && bPass)
                possibilities.add(i);
        }

        for (int i : possibilities) {
            System.out.print(i + " ");
        }

        return possibilities.size();
    }
}
