package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesWalkPerDay = Integer.parseInt(scanner.nextLine());
        int numberDailyWalks = Integer.parseInt(scanner.nextLine());
        int takenDailyCalories = Integer.parseInt(scanner.nextLine());


        int totalMinutesWalkPerDay = minutesWalkPerDay * numberDailyWalks;
        int burnedCaloriesFromWalk = totalMinutesWalkPerDay * 5;

        if (burnedCaloriesFromWalk >= (0.5 * takenDailyCalories)) {
            System.out.printf("Yes, the walk for your cat is enough. " +
                    "Burned calories per day: %d.", burnedCaloriesFromWalk);
        } else {
            System.out.printf("No, the walk for your cat is not enough. " +
                    "Burned calories per day: %d.", burnedCaloriesFromWalk);
        }

    }
}
