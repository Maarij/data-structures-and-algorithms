package main.java.strivers.step1.step2.patternproblems;

public class P14IncreasingLetterTriangle {
    //A
    //AB
    //ABC
    //ABCD
    //ABCDE
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
