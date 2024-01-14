package main.java.service.strivers.patternproblems;

public class P13IncreasingLetterTriangle {
    public static void main(String[] args) {
        char N = 5;

        for (char i = 0; i < N; i++) {
            for (char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
