package main.java.service.strivers.patternproblems;

public class P4RightAngledNumberPyramidII {

    //1
    //22
    //333
    //4444
    //55555
    public static void main(String[] args) {
        int N = 5;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

}
