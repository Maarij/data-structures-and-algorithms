package main.java.strivers.patternproblems;

public class P15ReverseLetterTriangle {
    //ABCDE
    //ABCD
    //ABC
    //AB
    //A
    public static void main(String[] args){
        int N = 5;

        for (int i = 0; i < N; i++) {
            for(char j = 'A'; j < 'A' + N - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
