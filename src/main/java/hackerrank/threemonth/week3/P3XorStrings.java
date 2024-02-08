package main.java.hackerrank.threemonth.week3;

public class P3XorStrings {
    public static void main(String args[]) throws Exception {
        for (int i = 0; i < args[0].toCharArray().length; i++) {
            if (args[0].toCharArray()[i] == '1' ^ args[1].toCharArray()[i] == '1') {
                System.out.print("1");
            } else {
                System.out.print("0");
            }
        }
    }
}
