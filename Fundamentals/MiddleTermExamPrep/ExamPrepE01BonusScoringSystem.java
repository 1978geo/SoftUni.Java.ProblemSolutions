package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExamPrepE01BonusScoringSystem {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        int attendances = 0;
        double totalBonus = 0;
        List<Double> totalBonusList = new ArrayList<>();
        List<Integer> attendanceList = new ArrayList<>();

        if (countOfLectures > 0 && countOfStudents >0) {
            for (int i = 0; i < countOfStudents; i++) {

                attendances = Integer.parseInt(scanner.nextLine());
                attendanceList.add(i, attendances);
                totalBonus = Math.round((attendances) / (double) (countOfLectures) * (5 + initialBonus));
                totalBonusList.add(i, totalBonus);

            }
            Collections.sort(totalBonusList);
            Collections.sort(attendanceList);


            System.out.printf("Max Bonus: %.0f.%n", totalBonusList.get(totalBonusList.size() - 1));
            System.out.printf("The student has attended %d lectures.", attendanceList.get(attendanceList.size() - 1));
        }
    }
}
