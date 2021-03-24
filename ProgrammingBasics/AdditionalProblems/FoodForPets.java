package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());

        double biscuit = 0;
        double totalEatenFood = 0;
        double totalDogEatenFood = 0;
        double totalCatEatenFood = 0;
        for (int i = 1; i <= days; i++) {
            int dogFood = Integer.parseInt(scanner.nextLine());
            int catFood = Integer.parseInt(scanner.nextLine());

            double dailyEatenFood = dogFood + catFood;

            totalEatenFood = totalEatenFood + dailyEatenFood;
            totalDogEatenFood = totalDogEatenFood + dogFood;
            totalCatEatenFood = totalCatEatenFood + catFood;

            if (i % 3 == 0){
                biscuit = biscuit + dailyEatenFood * 0.10;
            }
        }

        System.out.printf("Total eaten biscuits: %.0fgr.%n", biscuit);
        System.out.printf("%.2f%% of the food has been eaten.%n", totalEatenFood / allFood * 100);
        System.out.printf("%.2f%% eaten from the dog.%n", totalDogEatenFood / totalEatenFood * 100);
        System.out.printf("%.2f%% eaten from the cat.%n", totalCatEatenFood / totalEatenFood * 100);
    }
}