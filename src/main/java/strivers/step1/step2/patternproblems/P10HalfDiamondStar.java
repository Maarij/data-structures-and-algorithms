package main.java.strivers.step1.step2.patternproblems;

public class P10HalfDiamondStar {
    public static void main(String[] args){
        int N = 5;

        for (int i = 1; i <= N * 2 - 1; i++) {
            int stars = i;

            if (i > N) stars = 2 * N - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
