package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";
        String accomodation = "";


        if (budget <= 100 && season.equals("summer")) {
            budget *= 0.3;
            destination = "Bulgaria";
            accomodation = "Camp";
        }
        if (budget <= 100 && season.equals("winter")) {
            budget *= 0.7;
            destination = "Bulgaria";
            accomodation = "Hotel";
        }
        if (budget > 100 && budget <= 1000 && season.equals("summer")) {
            budget *= 0.4;
            destination = "Balkans";
            accomodation = "Camp";
        }
        if (budget > 100 && budget <= 1000 && season.equals("winter")) {
            budget *= 0.8;
            destination = "Balkans";
            accomodation = "Hotel";
        }
        if ((budget > 1000 && season.equals("summer")) ||
                (budget > 1000 && season.equals("winter"))) {
            budget *= 0.9;
            destination = "Europe";
            accomodation = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f", accomodation, budget);

    }
}
