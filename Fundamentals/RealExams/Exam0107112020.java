package SoftUniJavaProblemSolutions.Fundamentals.RealExams;

import java.util.Scanner;

public class Exam0107112020 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double neededExperience = Double.parseDouble(scanner.nextLine());

        int countOfBattles = Integer.parseInt(scanner.nextLine());

        int battlesWon = 0;
        double gainedExperience = 0;

        for (int i = 1; i <= countOfBattles; i++) {
            double experiencePerBattle = Double.parseDouble(scanner.nextLine());

            battlesWon++;

            if (gainedExperience < neededExperience) {
                if (battlesWon % 3 == 0) {
                    experiencePerBattle = experiencePerBattle * 1.15;
                }
                if (battlesWon % 5 == 0) {
                    experiencePerBattle = experiencePerBattle * 0.9;
                }
                if (battlesWon % 15 == 0) {
                    experiencePerBattle = experiencePerBattle * 1.05;
                }
            }

            gainedExperience += experiencePerBattle;

            if (gainedExperience >= neededExperience) {
                break;
            }

        }
        if (gainedExperience >= neededExperience) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", battlesWon);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", neededExperience - gainedExperience);
        }

    }
}
