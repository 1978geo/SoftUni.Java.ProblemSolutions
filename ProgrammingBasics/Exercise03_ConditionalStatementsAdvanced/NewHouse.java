package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfFlowers = scanner.nextLine();
        int numberOfFlowers = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double Expenses = 0;


        switch (typeOfFlowers) {
            case "Roses":
                Expenses = numberOfFlowers * 5.00;
                if (numberOfFlowers > 80) {
                    Expenses *= 0.9;
                }
                break;
            case "Dahlias":
                Expenses = numberOfFlowers * 3.80;
                if (numberOfFlowers > 90) {
                    Expenses *= 0.85;
                }
                break;

            case "Tulips":
                Expenses = numberOfFlowers * 2.80;
                if (numberOfFlowers > 80) {
                    Expenses *= 0.85;
                }
                break;

            case "Narcissus":
                Expenses = numberOfFlowers * 3.00;
                if (numberOfFlowers < 120) {
                    Expenses *= 1.15;
                }
                break;

            case "Gladiolus":
                Expenses = numberOfFlowers * 2.50;
                if (numberOfFlowers < 80) {
                    Expenses *= 1.20;
                }
                break;

        }
        if (Expenses <= budget) {
            System.out.printf("Hey, you have a great garden with %d " +
                    "%s and %.2f leva left.", numberOfFlowers, typeOfFlowers, Math.abs(Expenses - budget));
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(Expenses - budget));
        }


    }
}
