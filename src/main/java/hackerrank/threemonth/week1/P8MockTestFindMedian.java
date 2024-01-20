package main.java.hackerrank.threemonth.week1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class P8MockTestFindMedian {
    public static void main(String[] args){
        System.out.println(findMedian(Arrays.asList(1,6,3,2,1)));
    }

    public static int findMedian(List<Integer> arr) {
        arr.sort(Comparator.comparingInt(o -> o));
        return arr.get(arr.size()/2);
    }
}
