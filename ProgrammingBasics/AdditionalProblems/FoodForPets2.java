package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class FoodForPets2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDays = Integer.parseInt(scanner.nextLine());
        double foodQuantity = Double.parseDouble(scanner.nextLine());

        double eatenBiscuits = 0;
        double totalEatenFood = 0;
        double totalDogEatenFood = 0;
        double totalCatEatenFood = 0;

        for (int i = 1; i <= numberOfDays; i++) {
            int dogEatenFoodQuantity = Integer.parseInt(scanner.nextLine());
            int catEatenFoodQuantity = Integer.parseInt(scanner.nextLine());

            double dailyEatenFood = dogEatenFoodQuantity + catEatenFoodQuantity;


            totalEatenFood = totalEatenFood + dailyEatenFood;
            totalDogEatenFood = totalDogEatenFood + dogEatenFoodQuantity;
            totalCatEatenFood = totalCatEatenFood + catEatenFoodQuantity;

            if (i % 3 == 0) {
                eatenBiscuits = eatenBiscuits + dailyEatenFood * 0.10;
            }
        }

        System.out.printf("Total eaten biscuits: %.0fgr.%n", eatenBiscuits);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalEatenFood / foodQuantity * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDogEatenFood / totalEatenFood * 100);
        System.out.printf("%.2f%% eaten from the cat.%n", totalCatEatenFood / totalEatenFood * 100);
    }
}
