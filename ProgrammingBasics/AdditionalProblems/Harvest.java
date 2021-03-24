package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int squareAreaVineyard = Integer.parseInt(scanner.nextLine());
        double grapePerSqM = Double.parseDouble(scanner.nextLine());
        int litersWineNeeded = Integer.parseInt(scanner.nextLine());
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());

        double allGrape = squareAreaVineyard * grapePerSqM;
        double allWine = allGrape * 0.4 / 2.5;

        double difference = Math.abs(allWine - litersWineNeeded);
        double differencePerWorker = difference / numberOfWorkers;
        if (allWine < litersWineNeeded) {
            difference = Math.floor(difference);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", difference);
        }
        if (allWine > litersWineNeeded) {
            difference = Math.ceil(difference);
            differencePerWorker = Math.ceil(differencePerWorker);
            allWine = Math.ceil(allWine);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", allWine);
            System.out.printf("%.0f liters left -> %.0f liters per person.", difference, differencePerWorker);
        }


    }
}
