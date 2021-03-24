package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab01_FirstStepsInCoding;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMetersForGreening = Double.parseDouble(scanner.nextLine());

        double pricePerSqMet = 7.61;
        double discountPercentage = 0.18;

        double priceYardGreening = squareMetersForGreening * pricePerSqMet;
        double discount = priceYardGreening * discountPercentage;
        double finalPrice = priceYardGreening - discount;

        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " +discount +" lv.");
    }
    }
