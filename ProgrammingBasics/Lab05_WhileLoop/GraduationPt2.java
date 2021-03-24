package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab05_WhileLoop;

import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        int classCounter = 0;
        double allSumGrades = 0;
        int lowGradesCounter = 0;

        while (classCounter != 12) {

            double currentYearGrade = Double.parseDouble(scanner.nextLine());

            if (currentYearGrade < 4) {
                lowGradesCounter++;
                if (lowGradesCounter > 1) {
                    break;
                }
            }
            classCounter++;
            allSumGrades += currentYearGrade;
        }
        if (classCounter == 12) {
            System.out.printf("%s graduated. Average grade: %.2f", name, allSumGrades / 12);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, classCounter);
        }

    }
}