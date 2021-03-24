package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class HoneyWinterReserves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double honeyNeeded = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        double allBeesHoneyGathered = 0;
        while (!input.equals("Winter has come")) {


            double beeHoneyGathered = 0;

            for (int i = 1; i <= 6; i++) {

                double gatheredMonthlyHoney = Double.parseDouble(scanner.nextLine());
                beeHoneyGathered = beeHoneyGathered + gatheredMonthlyHoney;

            }
            if (beeHoneyGathered < 0) {
                System.out.printf("%s was banished for gluttony%n", input);
            }
            allBeesHoneyGathered = allBeesHoneyGathered + beeHoneyGathered;
            if (allBeesHoneyGathered >= honeyNeeded) {
                break;
            }
            input = scanner.nextLine();
        }

        if (allBeesHoneyGathered >= honeyNeeded) {
            System.out.printf("Well done! Honey surplus %.2f.", allBeesHoneyGathered - honeyNeeded);
        } else {
            System.out.printf("Hard Winter! Honey needed %.2f.", honeyNeeded - allBeesHoneyGathered);
        }

    }
}

