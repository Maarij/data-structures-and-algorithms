package main.java.hackerrank.threemonth.week2;

public class P7MarsExploration {
    public static void main(String[] args) {
        System.out.println(marsExploration("SOSSPSSQSSOR"));
        System.out.println(marsExploration("SOSSOT"));
    }

    // SOS SPS SQS SOR
    // 012 012
    private static int marsExploration(String s) {
        int lettersChanged = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i % 3 == 1) {
                if (s.toCharArray()[i] != 'O') {
                    lettersChanged++;
                }
            } else {
                if (s.toCharArray()[i] != 'S') {
                    lettersChanged++;
                }
            }
        }

        return lettersChanged;
    }
}
