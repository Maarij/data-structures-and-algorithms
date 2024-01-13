package main.java.service.strivers.patternproblems;

public class P4RightAngledNumberPyramidII {
    public static void main (String[] args) {
        int size = 6;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
