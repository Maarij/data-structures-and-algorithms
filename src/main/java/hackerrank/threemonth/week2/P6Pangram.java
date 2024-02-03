package main.java.hackerrank.threemonth.week2;

public class P6Pangram {
    public static void main(String[] args){
        System.out.println(pangrams("The quick brown fox jumps over the lazy dob"));
    }

    private static String pangrams(String s) {
        int[] letters = new int[26];

        for (char c : s.toLowerCase().toCharArray()) {
            if (!Character.isLetter(c)) {
                continue;
            }
            letters[c - 'a']++;
        }

        for(int i : letters) {
            if (i == 0) return "not pangram";
        }

        return "pangram";
    }
}
