package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab04_ForLoop;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageLily = Integer.parseInt(scanner.nextLine());
        double priceWashMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int counterToys = 0;
        int counterEvenYears = 0;
        int sumGiftMoney = 0;
        int totalSumGiftMoney = 0;

        for (int i = 1; i <= ageLily; i++) {

            if (i % 2 != 0) {
                counterToys++;
            } else {
                sumGiftMoney = sumGiftMoney + 10;
                totalSumGiftMoney = totalSumGiftMoney + sumGiftMoney;
                counterEvenYears++;
            }

        }

        int toysMoney = counterToys * toyPrice;
        int totalSumMoney = toysMoney + totalSumGiftMoney - counterEvenYears * 1;

        if (totalSumMoney >= priceWashMachine) {
            System.out.printf("Yes! %.2f", Math.abs(totalSumMoney - priceWashMachine));
        } else {
            System.out.printf("No! %.2f", Math.abs(totalSumMoney - priceWashMachine));
        }

    }
}
