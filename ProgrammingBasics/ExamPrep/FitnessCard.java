package SoftUniJavaProblemSolutions.ProgrammingBasics.ExamPrep;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sumOwned = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double moneyNeeded = 0;

        if ((sex.equals("m") && sport.equals("Gym"))) {
            moneyNeeded = 42;

        }
        if ((sex.equals("m") && sport.equals("Boxing"))) {
            moneyNeeded = 41;

        }
        if ((sex.equals("m") && sport.equals("Yoga"))) {
            moneyNeeded = 45;

        }
        if ((sex.equals("m") && sport.equals("Zumba"))) {
            moneyNeeded = 34;

        }
        if ((sex.equals("m") && sport.equals("Dances"))) {
            moneyNeeded = 51;

        }
        if ((sex.equals("m") && sport.equals("Pilates"))) {
            moneyNeeded = 39;

        }
        if ((sex.equals("f") && sport.equals("Gym"))) {
            moneyNeeded = 35;

        }
        if ((sex.equals("f") && sport.equals("Boxing"))) {
            moneyNeeded = 37;

        }
        if ((sex.equals("f") && sport.equals("Yoga"))) {
            moneyNeeded = 42;

        }
        if ((sex.equals("f") && sport.equals("Zumba"))) {
            moneyNeeded = 31;
        }
        if ((sex.equals("f") && sport.equals("Dances"))) {
            moneyNeeded = 53;
        }
        if ((sex.equals("f") && sport.equals("Pilates"))) {
            moneyNeeded = 37;
        }

        if (age <= 19) {
            moneyNeeded = moneyNeeded * 0.8;
        }
        if (sumOwned >= moneyNeeded) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! " +
                    "You need $%.2f more.", Math.abs(sumOwned - moneyNeeded));
        }
    }
}

