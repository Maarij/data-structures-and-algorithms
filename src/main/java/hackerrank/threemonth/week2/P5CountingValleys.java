package main.java.hackerrank.threemonth.week2;

public class P5CountingValleys {
    public static void main(String[] args){
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }

    public static int countingValleys(int steps, String path) {
        if (path == null || path.length() < 2) {
            return 0;
        }

        int seaLevel = 0;
        int valleyCount = 0;

        for (char c : path.toCharArray()) {
            if (c == 'D' && seaLevel <= 0) {
                seaLevel--;
            } else if (c == 'U' && seaLevel < 0) {
                seaLevel++;
                if (seaLevel == 0) valleyCount++;
            } else if (c == 'D') {
                seaLevel--;
            } else if (c == 'U') {
                seaLevel++;
            }
        }

        return  valleyCount;
    }
}
