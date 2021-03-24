package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceMackerel = Double.parseDouble(scanner.nextLine());
        double priceToy = Double.parseDouble(scanner.nextLine());
        double kgChamois = Double.parseDouble(scanner.nextLine());
        double kgHorseMackerel = Double.parseDouble(scanner.nextLine());
        double kgMussle = Double.parseDouble(scanner.nextLine());

        double priceChamois = priceMackerel*1.6;
        double priceHorseMackerel = priceToy*1.8;
        double priceMussle = 7.5;

        double moneyNeeded = (kgChamois*priceChamois + kgHorseMackerel*priceHorseMackerel + kgMussle*priceMussle);

        System.out.printf("%.2f", moneyNeeded);

    }
}
