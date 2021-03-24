package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class CareOfPuppy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodQuantityKG = Integer.parseInt(scanner.nextLine());

        int foodQuantityGR = foodQuantityKG * 1000;

        String input = scanner.nextLine();

        int totalEatenMeal = 0;

        while (!input.equals("Adopted")) {
            int mealQuantity = Integer.parseInt(input);

            totalEatenMeal = totalEatenMeal + mealQuantity;


            input = scanner.nextLine();
        }

            if (foodQuantityGR >= totalEatenMeal) {
                System.out.printf("Food is enough! Leftovers: %d grams.",
                        Math.abs(totalEatenMeal - foodQuantityGR));
            } else {
                System.out.printf("Food is not enough. You need %d grams more.",
                        Math.abs(totalEatenMeal - foodQuantityGR));
            }


    }
}
