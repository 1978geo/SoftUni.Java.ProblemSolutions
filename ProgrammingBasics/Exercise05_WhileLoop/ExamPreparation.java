package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise05_WhileLoop;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberLowGrades = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int sumAllGrades = 0;
        int problemNameCounter = 0;
        int lowGradesCounter = 0;
        String lastProblem = "";

        while (!input.equals("Enough")) {
            lastProblem = input;
            int currentgrade = Integer.parseInt(scanner.nextLine());

            sumAllGrades += currentgrade;
            problemNameCounter++;
            if (currentgrade <= 4) {
                lowGradesCounter++;
            }

            if (lowGradesCounter == numberLowGrades) {
                System.out.printf("You need a break, %d poor grades.", numberLowGrades);
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("Enough")) {
            System.out.printf("Average score: %.2f%n", sumAllGrades * 1.0 / problemNameCounter);
            System.out.printf("Number of problems: %d%n", problemNameCounter);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
