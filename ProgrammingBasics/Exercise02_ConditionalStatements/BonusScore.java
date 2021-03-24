package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise02_ConditionalStatements;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int basicPoints = Integer.parseInt(scanner.nextLine());
        double bonusPoints;


        if (basicPoints <= 100) {
            bonusPoints = 5;

        } else if (basicPoints > 1000) {

            bonusPoints = basicPoints * 0.1;
        } else {

            bonusPoints = basicPoints * 0.2;
        }

        if (basicPoints % 2 == 0) {
            bonusPoints = bonusPoints + 1;
        }
        if (basicPoints % 10 == 5) {
            bonusPoints = bonusPoints + 2;
        }

        double allPoints = (basicPoints + bonusPoints);

        System.out.printf("%.1f%n", bonusPoints);

        System.out.printf("%.1f", allPoints);

    }
}
