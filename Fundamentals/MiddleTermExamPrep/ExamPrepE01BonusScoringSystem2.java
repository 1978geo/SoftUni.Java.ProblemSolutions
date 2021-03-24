package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Scanner;

public class ExamPrepE01BonusScoringSystem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());

        int attendances = 0;
        double totalBonus = 0;
        double maxTotalBonus = 0;
        int maxAttendances = 0;


        for (int i = 0; i < countOfStudents; i++) {

            attendances = Integer.parseInt(scanner.nextLine());

            totalBonus = Math.round((attendances) / (double) (countOfLectures) * (5 + initialBonus));

            if (totalBonus > maxTotalBonus) {
                maxTotalBonus = totalBonus;
                maxAttendances = attendances;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", maxTotalBonus);
        System.out.printf("The student has attended %d lectures.", maxAttendances);
    }
}
