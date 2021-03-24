package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class EnergyBooster2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int numberSets = Integer.parseInt(scanner.nextLine());

        double finalPrice = 0;

        if (fruit.equals("Watermelon") && size.equals("small")) {

            finalPrice = 2 * 56 * numberSets;

        }
        if (fruit.equals("Raspberry") && size.equals("small")) {

            finalPrice = 2 * 20 * numberSets;

        }
        if (fruit.equals("Mango") && size.equals("small")) {

            finalPrice = 2 * 36.66 * numberSets;

        }
        if (fruit.equals("Pineapple") && size.equals("small")) {

            finalPrice = 2 * 42.10 * numberSets;

        }

        if (fruit.equals("Watermelon") && size.equals("big")) {

            finalPrice = 5 * 28.70 * numberSets;

        }
        if (fruit.equals("Raspberry") && size.equals("big")) {

            finalPrice = 5 * 15.20 * numberSets;

        }
        if (fruit.equals("Mango") && size.equals("big")) {

            finalPrice = 5 * 19.60 * numberSets;

        }
        if (fruit.equals("Pineapple") && size.equals("big")) {

            finalPrice = 5 * 24.80 * numberSets;

        }

        if (finalPrice >= 400 && finalPrice <= 1000) {
            finalPrice = finalPrice * 0.85;
        }
        if (finalPrice > 1000) {
            finalPrice = finalPrice * 0.50;
        }
        System.out.printf("%.2f lv.", finalPrice);
    }
}
