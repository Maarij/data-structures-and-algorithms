package main.java.hackerrank.threemonth.week3;

public class P8DrawingBook {
    public static void main(String[] args) {
        System.out.println(pageCount(5, 3));
    }

    // - | 1
    // 2 | 3
    // 4 | 5
    // 6 | 7
    // 8 | -

    // 8 - 2x = 3
    private static int pageCount(int n, int p) {
        int pagesInTheBook = n;
        int pageToReach = p;

        // We need to bring to the closest odd integer because:
        //  - since we are using ints, the division will always be rounded down
        //  - e.g. 6 pages total and we need to reach page 5 => coming from the end, (6 - 5) / 2 = 1 / 2 => rounds down to 0
        //    when we need ((6+1) - 5) / 2 = 2 / 2 = 1
        if (pagesInTheBook % 2 == 0)
            pagesInTheBook++;

        // Moving from end, we need to only get to the desired number, therefore we exclude the pages from start
        // until desired page.
        // Also each 2 values means 1 page flip just like counting from the start
        int fromBack = (pagesInTheBook - pageToReach) / 2;

        // Moving from start, each 2 values means 1 page flip
        // Therefore, number of page flips is (desired page / 2)
        int fromFront = pageToReach / 2;

        return Math.min(fromBack, fromFront);
    }
}
