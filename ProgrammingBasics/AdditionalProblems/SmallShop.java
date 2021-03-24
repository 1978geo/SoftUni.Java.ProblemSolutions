package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        double price = 0;

        if (city.equals("Sofia")) {
            switch (product) {
                case "coffee":
                    price = quantity * 0.50;
                    break;
                case "water":
                    price = quantity * 0.80;
                    break;
                case "beer":
                    price = quantity * 1.20;
                    break;
                case "sweets":
                    price = quantity * 1.45;
                    break;
                case "peanuts":
                    price = quantity * 1.60;
                    break;
            }

        }
        if (city.equals("Plovdiv")) {
            switch (product) {
                case "coffee":
                    price = quantity * 0.40;
                    break;
                case "water":
                    price = quantity * 0.70;
                    break;
                case "beer":
                    price = quantity * 1.15;
                    break;
                case "sweets":
                    price = quantity * 1.30;
                    break;
                case "peanuts":
                    price = quantity * 1.50;
                    break;
            }
        }
        if (city.equals("Varna")) {
            switch (product) {
                case "coffee":
                    price = quantity * 0.45;
                    break;
                case "water":
                    price = quantity * 0.70;
                    break;
                case "beer":
                    price = quantity * 1.10;
                    break;
                case "sweets":
                    price = quantity * 1.35;
                    break;
                case "peanuts":
                    price = quantity * 1.55;
                    break;
            }
        }

        System.out.printf("%.1f",price);

    }
}
