package main.java.service.strivers.patternproblems;

public class P12NumberCrown {

    //1________1
    //12______21
    //123____321
    //1234__4321
    //1234554321
    public static void main(String[] args){
        int N = 5;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 0; j < (N - i) * 2; j++) {
                System.out.print("_");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
