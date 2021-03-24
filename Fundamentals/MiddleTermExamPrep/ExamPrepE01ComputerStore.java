package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Scanner;

public class ExamPrepE01ComputerStore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalPriceTaxFree = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double priceTaxFree = Double.parseDouble(input);
            if (priceTaxFree < 0) {
                System.out.println("Invalid price!");
                priceTaxFree = 0;
            }
            totalPriceTaxFree += priceTaxFree;
            input = scanner.nextLine();
        }

        if (totalPriceTaxFree == 0) {
            System.out.println("Invalid order!");
        } else {
            System.out.println("Congratulations you've just bought a new computer!");
            System.out.printf("Price without taxes: %.2f$%n", totalPriceTaxFree);
            System.out.printf("Taxes: %.2f$%n", totalPriceTaxFree * 0.2);
            System.out.println("-----------");
            if (input.equals("special")) {
                System.out.printf("Total price: %.2f$", (totalPriceTaxFree * 1.2) * 0.9);

            } else {
                System.out.printf("Total price: %.2f$", (totalPriceTaxFree * 1.2));
            }
        }
    }
}

