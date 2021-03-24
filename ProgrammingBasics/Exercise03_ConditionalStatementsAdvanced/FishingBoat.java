package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numberOfFishers = Integer.parseInt(scanner.nextLine());

        double expenses = 0;


        switch (season) {
            case "Spring":
                expenses = 3000;
                break;
            case "Summer":
            case "Autumn":
                expenses = 4200;
                break;
            case "Winter":
                expenses = 2600;
                break;
            default:
                break;
        }
        if (numberOfFishers <= 6) {
            expenses *= 0.9;
        }
        if (numberOfFishers > 6 && numberOfFishers <= 11) {
            expenses *= 0.85;
        }
        if (numberOfFishers >= 12) {
            expenses *= 0.75;
        }
        if ((season.equals("Winter") || season.equals("Summer") ||
                season.equals("Spring")) && (numberOfFishers % 2 == 0) ) {
            expenses *= 0.95;
        }
        if (expenses <= budget) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(expenses - budget));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(expenses - budget));
        }


    }
}
