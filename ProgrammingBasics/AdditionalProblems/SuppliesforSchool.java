package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class SuppliesforSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double cleaningLiquid = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());


        double pricePens = pens * 5.80;
        double priceMarkers = markers * 7.20;
        double priceCleaningLiquid = cleaningLiquid * 1.20;

        double finalSumPrice = (priceCleaningLiquid + priceMarkers + pricePens) * (100 - discount) / 100;

        System.out.printf("%.3f", finalSumPrice);
    }
}
