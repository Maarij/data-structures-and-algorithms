package main.java.strivers.step1.step2.patternproblems;

public class P1RectangularStar {

    //***
    //***
    //***
    public static void main (String[] args) {
        int size = 3;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}