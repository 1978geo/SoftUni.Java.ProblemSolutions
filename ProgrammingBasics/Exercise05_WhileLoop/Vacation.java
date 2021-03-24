package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise05_WhileLoop;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double ownedMoney = Double.parseDouble(scanner.nextLine());

        int spendDaysCounter = 0;
        int daysCounter = 0;

        while (ownedMoney < neededMoney && spendDaysCounter < 5) {

            String command = scanner.nextLine();
            double currentMoney = Double.parseDouble(scanner.nextLine());

            daysCounter++;

            if (command.equals(("save"))) {
                ownedMoney += currentMoney;
                spendDaysCounter = 0;
            } else if (command.equals(("spend"))) {
                ownedMoney -= currentMoney;
                spendDaysCounter++;
                if (ownedMoney < 0) {
                    ownedMoney = 0;
                }
            }
        }
        if (spendDaysCounter == 5) {
            System.out.println("You can't save the money.");
            System.out.printf("%d", daysCounter);
        } else {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }

    }
}
