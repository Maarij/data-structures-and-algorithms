package main.java.grind75.week3;

public class P4FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }

    private static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }

    private static boolean isBadVersion(int n) {
        return n >= 4;
    }

    // 1 2 3 4 5
    //


}
