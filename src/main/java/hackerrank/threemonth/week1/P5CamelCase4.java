package main.java.hackerrank.threemonth.week1;

import java.util.Scanner;

public class P5CamelCase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();

            String[] split = input.split(";");
            String regex = "(?<!^)(?=[A-Z])";
            String[] word;

            if (split[0].equals("S")) {
                switch (split[1]) {
                    case "M":
                    case "V":
                        word = split[2].split(regex);
                        for (int i = 0; i < word.length; i++) {
                            if (i == word.length - 1 && split[1].equals("M")) {
                                word[i] = word[i].substring(0, word[i].length() - 2);
                            }
                            System.out.print(word[i].toLowerCase() + " ");
                        }
                        break;
                    case "C":
                        word = split[2].split(regex);
                        for (String w : word) {
                            System.out.print(w.toLowerCase() + " ");
                        }
                        break;
                    default:
                }
            } else if (split[0].equals("C")) {
                switch (split[1]) {
                    case "M":
                    case "V":
                        word = split[2].split(" ");
                        for (int i = 0; i < word.length; i++) {
                            if (i != 0) {
                                word[i] = word[i].substring(0, 1).toUpperCase() + word[i].substring(1);
                            }
                            System.out.print(word[i]);
                        }
                        if (split[1].equals("M")) {
                            System.out.print("()");
                        }
                        break;
                    case "C":
                        word = split[2].split(" ");
                        for(String w : word) {
                            System.out.print(w.substring(0, 1).toUpperCase() + w.substring(1));
                        }
                        break;
                    default:
                }
            }
            System.out.println();
        }
    }
}
