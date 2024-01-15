package main.java.strivers.patternproblems;

public class P20SymmetricButterfly {
    //*          *
    //**        **
    //***      ***
    //****    ****
    //*****  *****
    //************
    //*****  *****
    //****    ****
    //***      ***
    //**        **
    //*          *
    public static void main(String[] args) {
        int N = 5;
        int spaces = 2 * N - 2;

        for (int i = 1; i <= 2 * N - 1; i++) {
            int stars = i;

            if (i > N) stars = 2 * N - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < N) spaces -= 2;
            else spaces += 2;
        }

    }
}
