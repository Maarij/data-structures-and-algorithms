package main.java.strivers.step1.step2.patternproblems;

public class P13IncreasingNumberTriangle {

    //1
    //2 3
    //4 5 6
    //7 8 9 10
    //11 12 13 14 15
    public static void main(String[] args){
        int N = 5;
        int count = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
