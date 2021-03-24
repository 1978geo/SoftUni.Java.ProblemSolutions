package SoftUniJavaProblemSolutions.Fundamentals.Exercise01_BasicSyntax_ConditionalStatementsAndLoops;

import java.util.Scanner;

public class E0107VendingMachine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalMoney = 0;
        double purchaseAmount = 0;

        while (!input.equals("Start")) {
            double currentCoins = Double.parseDouble(input);

            if (currentCoins == 0.1 || currentCoins == 0.2
                    || currentCoins == 0.5 || currentCoins == 1 || currentCoins == 2) {
                totalMoney += currentCoins;
            } else {
                System.out.printf("Cannot accept %.2f%n", currentCoins);
            }
            input = scanner.nextLine();
        }
        input = scanner.nextLine();

        while (!input.equals("End")) {

            double price = 0;
            switch (input) {
                case "Nuts":
                    price = 2.0;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            purchaseAmount += price;

            if (purchaseAmount > totalMoney) {
                purchaseAmount = purchaseAmount - price;
                System.out.println("Sorry, not enough money");

            } else if ((purchaseAmount <= totalMoney && totalMoney != 0) && (input.equals("Nuts") || input.equals("Water")
                    || input.equals("Crisps") || input.equals("Soda") || input.equals("Coke"))) {
                System.out.printf("Purchased %s%n", input);
            }
            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", totalMoney - purchaseAmount);
    }
}
//"Nuts", "Water", "Crisps", "Soda", "Coke".