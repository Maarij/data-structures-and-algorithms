package main.java.grind75.week3;

public class P5RansomNote {
    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));
        System.out.println(canConstruct("aa", "ab"));
        System.out.println(canConstruct("aa", "aab"));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];

        for (char c : magazine.toCharArray()) {
            letters[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            letters[c - 'a']--;
        }

        for (int i : letters) {
            if (i < 0) return false;
        }

        return true;
    }
}
