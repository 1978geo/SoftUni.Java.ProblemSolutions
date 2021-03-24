package SoftUniJavaProblemSolutions.ProgrammingBasics.ExamPrep;

import java.util.Scanner;

public class FitnessCard2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sumOwned = Double.parseDouble(scanner.nextLine());
        String sex = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double moneyNeeded = 0;

        if ((sex.equals("m"))) {
            if (sport.equals("Gym")) {
                moneyNeeded = 42;
            } else if (sport.equals("Boxing")) {
                moneyNeeded = 41;
            } else if (sport.equals("Yoga")) {
                moneyNeeded = 45;
            } else if (sport.equals("Zumba")) {
                moneyNeeded = 34;
            } else if (sport.equals("Dances")) {
                moneyNeeded = 51;
            } else if (sport.equals("Pilates")){
                moneyNeeded = 39;
            }
        }

        if ((sex.equals("f"))) {
            if (sport.equals("Gym")) {
                moneyNeeded = 35;
            } else if (sport.equals("Boxing")) {
                moneyNeeded = 37;
            } else if (sport.equals("Yoga")) {
                moneyNeeded = 42;
            } else if (sport.equals("Zumba")) {
                moneyNeeded = 31;
            } else if (sport.equals("Dances")) {
                moneyNeeded = 53;
            } else if (sport.equals("Pilates")) {
                moneyNeeded = 37;
            }
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


