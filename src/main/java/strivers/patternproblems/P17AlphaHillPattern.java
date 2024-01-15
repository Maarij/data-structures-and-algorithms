package main.java.strivers.patternproblems;

public class P17AlphaHillPattern {
    //E
    //DE
    //CDE
    //BCDE
    //ABCDE
    public static void main(String[] args) {
        int N = 3;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print("_");
            }

            char start = 'A';
            int halfway = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(start);
                if (j <= halfway) start++;
                else start--;
            }

            for (int j = 0; j < N - i - 1; j++) {
                System.out.print("_");
            }

            System.out.println();
        }
    }
}
