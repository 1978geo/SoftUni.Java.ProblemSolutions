package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfDogs = Integer.parseInt(scanner.nextLine());
        int numberOfOtherAnimals = Integer.parseInt(scanner.nextLine());

        double priceOfDogFood = 2.50;
        double priceOfOtherAnimalFood = 4.0;

        double expenseDogFood = numberOfDogs * priceOfDogFood;
        double expenseOtherAnimalFood = numberOfOtherAnimals * priceOfOtherAnimalFood;

        double sum = expenseDogFood + expenseOtherAnimalFood;

        System.out.println(sum + "lv");

    }
}
