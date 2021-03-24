package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ExamPrepE02ShootForTheWin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] target = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        String input = scanner.nextLine();

        int countShotTargets = 0;

        int[] shotTargets = new int[target.length];

        while (!input.equals("End")) {
            int indexNumber = Integer.parseInt(input);
            if (indexNumber >= 0 && indexNumber < shotTargets.length) {
                if (shotTargets[indexNumber] == -1) {
                    input = scanner.nextLine();
                    break;
                }
            }
//да сложа вътрешен каунтър с проверка, за да не се повтарят индексите :) !!!

            if (indexNumber >= 0 && indexNumber < target.length) {
                int currentNumber = target[indexNumber];
                for (int i = 0; i < target.length; i++) {

                    if (target[i] > currentNumber) {
                        target[i] = target[i] - currentNumber;
                    } else {
                        target[i] = target[i] + currentNumber;
                    }
                }
                countShotTargets++;
                target[indexNumber] = -1;
                shotTargets[indexNumber] = -1;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < target.length; i++) {

            if (shotTargets[i] != -1) {
                shotTargets[i] = target[i];
            }
        }
        System.out.printf("Shot targets: %d -> ", countShotTargets);
        System.out.print(shotTargets[0]);
        for (int i = 1; i < target.length; i++) {
            System.out.print(" " + shotTargets[i]);
        }
    }
}
