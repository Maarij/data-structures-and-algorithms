package main.java.strivers.step1.step2.patternproblems;

public class P19SymmetricVoid {
    //************
    //*****  *****
    //****    ****
    //***      ***
    //**        **
    //*          *
    //*          *
    //**        **
    //***      ***
    //****    ****
    //*****  *****
    //************
    public static void main(String[] args) {
        int N = 6;
        int initialSpaces = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < initialSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }

            initialSpaces += 2;

            System.out.println();
        }

        initialSpaces = 2 * N - 2;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < initialSpaces; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            initialSpaces -= 2;

            System.out.println();
        }
    }
}
