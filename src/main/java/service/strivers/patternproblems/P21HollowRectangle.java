package main.java.service.strivers.patternproblems;

public class P21HollowRectangle {

    //******
    //*    *
    //*    *
    //*    *
    //*    *
    //******
    public static void main(String[] args){
        int N = 5;

        for (int i = 0; i < N; i++) {
            System.out.print("*");

            String hollowPattern = i == 0 || i == N - 1 ? "*" : " ";
            for (int j = 0; j < N-2; j++) {
                System.out.print(hollowPattern);
            }

            System.out.println("*");
        }
    }
}
