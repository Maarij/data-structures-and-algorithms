package main.java.hackerrank.threemonth.week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P2GradingStudents {
    public static void main(String[] args){
        List<Integer> grades = gradingStudents(Arrays.asList(48, 49, 40, 38, 84, 85, 29, 57, 60, 0, 100));
        grades.forEach(g -> System.out.print(g + " "));
    }

    private static List<Integer> gradingStudents(List<Integer> inputGrades) {
        if (inputGrades == null || inputGrades.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> grades = new ArrayList<>();

        for(Integer grade : inputGrades) {
            grades.add(roundGrade(grade));
        }

        return grades;
    }

    private static int roundGrade(int grade) {
        if (grade < 38 || grade == 100) {
            return grade;
        }

        // mod 5 and see if
        if (grade % 5 == 4) {
            return grade + 1;
        } else if (grade % 5 == 3) {
            return grade + 2;
        }

        return grade;
    }
}
