package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allFoodKilograms = Integer.parseInt(scanner.nextLine());
        int allFoodGrams = allFoodKilograms * 1000;

        String inputLine = scanner.nextLine();

        int totalEatenFood = 0;
        while (!inputLine.equals("Adopted")) {
            int singleFood = Integer.parseInt(inputLine);

            totalEatenFood = totalEatenFood + singleFood;

            inputLine = scanner.nextLine();
        }

        int diff = Math.abs(allFoodGrams - totalEatenFood);

        if (totalEatenFood <= allFoodGrams){
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }
    }
}
