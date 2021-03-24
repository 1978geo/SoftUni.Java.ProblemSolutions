package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab05_WhileLoop;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sumDeposit = 0;

        while (!input.equals("NoMoreMoney")) {

            double currentSumDeposit = Double.parseDouble(input);

            if (currentSumDeposit < 0) {
                System.out.println("Invalid operation!");
                break;
            }

            sumDeposit += currentSumDeposit;

            System.out.printf("Increase: %.2f%n", currentSumDeposit);

            input = scanner.nextLine();

        }

        System.out.printf("Total: %.2f", sumDeposit);

    }
}
