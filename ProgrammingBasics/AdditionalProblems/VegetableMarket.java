package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceKgVg = Double.parseDouble(scanner.nextLine());
        double priceKgFr = Double.parseDouble(scanner.nextLine());
        int kgVgQuant = Integer.parseInt(scanner.nextLine());
        int kgFrQuant = Integer.parseInt(scanner.nextLine());

        double incomeAll = (priceKgVg*kgVgQuant+priceKgFr*kgFrQuant)/1.94;

        System.out.printf("%.2f", incomeAll);


    }
}
