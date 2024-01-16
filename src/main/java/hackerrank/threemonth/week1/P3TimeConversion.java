package main.java.hackerrank.threemonth.week1;

public class P3TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("12:45:54PM"));
    }

    private static String timeConversion(String s) {
        String[] args = s.split(":"); // 12 01 00PM

        boolean isAm = args[2].substring(2, 4).equals("AM");

        StringBuilder builder = new StringBuilder();
        if (isAm) {
            builder.append(args[0].equals("12") ? "00" : args[0]);
        } else {
            builder.append(args[0].equals("12") ? args[0] : Integer.parseInt(args[0]) + 12);
        }

        return builder.append(":").append(args[1]).append(":").append(args[2], 0, 2).toString();
    }
}
