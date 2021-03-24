package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise02_ConditionalStatements;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double priceClothesPerPerson = Double.parseDouble(scanner.nextLine());

        double priceDecor = budget*0.1;
        double priceClothes = people*priceClothesPerPerson;


        if (people > 150) {
            priceClothes = priceClothes*0.9;
                    }
        double totalExpenses = priceDecor + priceClothes;
        double difference = Math.abs(budget - totalExpenses);


        if (totalExpenses <= budget)
                 {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference, " leva left.");
        } else
        {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }

    }
}
