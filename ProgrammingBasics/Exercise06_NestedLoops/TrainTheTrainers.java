package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise06_NestedLoops;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberJury = Integer.parseInt(scanner.nextLine());

        int counterPresentations = 0;
        String input = scanner.nextLine();
        double totalGrades = 0;

        while (!input.equals("Finish")) {
            counterPresentations++;

            double gradeSum = 0;

            for (int j = 1; j <= numberJury; j++) {

                double currentGrade = Double.parseDouble(scanner.nextLine());
                gradeSum = gradeSum + currentGrade;

                if (numberJury == j) {
                    System.out.printf("%s - %.2f.%n", input, gradeSum / numberJury);
                }
            }
            double averageGrade = gradeSum / numberJury;
            totalGrades += averageGrade;
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", totalGrades / (counterPresentations));
    }
}




