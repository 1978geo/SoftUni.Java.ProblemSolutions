package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ExamPrepE02TheLift {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int waitingList = Integer.parseInt(scanner.nextLine());
        int[] liftWagons = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        for (int i = 0; i < liftWagons.length; i++) {
            int emptySpots = liftWagons[i];

            if (emptySpots >= 0 && emptySpots <= 4) {
                if (waitingList < 4) {
                    liftWagons[i] = waitingList + emptySpots;
                    if (liftWagons[i] > 4) {
                        waitingList = liftWagons[i] - 4;
                        break;
                    }
                    waitingList = waitingList - (4 - emptySpots);
                    break;
                }
                waitingList = waitingList - (4 - emptySpots);

                liftWagons[i] = emptySpots + (4 - emptySpots);
            }

        }
        if (waitingList > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingList);
            System.out.print(liftWagons[0]);
            for (int i = 1; i < liftWagons.length; i++) {
                System.out.print(" " + liftWagons[i]);
            }
        } else if (waitingList == 0) {
            System.out.print(liftWagons[0]);
            for (int i = 1; i < liftWagons.length; i++) {
                System.out.print(" " + liftWagons[i]);
            }
        } else {
            System.out.println("The lift has empty spots!");
            System.out.print(liftWagons[0]);
            for (int i = 1; i < liftWagons.length; i++) {
                System.out.print(" " + liftWagons[i]);
            }
        }
    }
}

