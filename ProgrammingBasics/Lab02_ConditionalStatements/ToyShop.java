package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab02_ConditionalStatements;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        int numberPuzzles = Integer.parseInt(scanner.nextLine());
        int numberDolls = Integer.parseInt(scanner.nextLine());
        int numberTeddys = Integer.parseInt(scanner.nextLine());
        int numberMinions = Integer.parseInt(scanner.nextLine());
        int numberTrucks = Integer.parseInt(scanner.nextLine());

        double income = (numberPuzzles * 2.60 + numberDolls * 3.0 +
                numberTeddys * 4.10 + numberMinions * 8.20 + numberTrucks * 2.0);


        int numberToys = (numberPuzzles + numberDolls + numberTeddys + numberMinions + numberTrucks);


        if (numberToys >= 50) {
            income = income * 0.75;
        }

        double rent = income * 0.1;
        double finalResult = Math.abs(income - (rent + trip));


        if ((income - (rent + trip) >= 0)) {
            System.out.printf("Yes! %.2f lv left.", finalResult);

        } else {

            System.out.printf("Not enough money! %.2f lv needed.", finalResult);
        }

    }
}
