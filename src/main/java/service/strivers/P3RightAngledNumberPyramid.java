package main.java.service.strivers;

public class P3RightAngledNumberPyramid {
    public static void main (String[] args) {
        int size = 6;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
