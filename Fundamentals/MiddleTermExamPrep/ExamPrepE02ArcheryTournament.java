package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ExamPrepE02ArcheryTournament {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] targets = Arrays.stream(scanner.nextLine().split("\\|")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        String input = scanner.nextLine();
        int points = 0;

        while (!input.equals("Game over")) {

            String[] commands = input.split("@");

            switch (commands[0]) {
                case "Shoot Left":
                    int startLeftIndex = Integer.parseInt(commands[1]);
                    int leftLength = Integer.parseInt(commands[2]);
                    int targetIndex = startLeftIndex - leftLength;
                    if (startLeftIndex < 0 || startLeftIndex > targets.length - 1) {
                        break;
                    } else {
                        while (targetIndex < 0) {
                            targetIndex = targetIndex + targets.length;
                        }
                        if (targets[targetIndex] >= 5) {
                            targets[targetIndex] -= 5;
                            points += 5;
                        } else {
                            points += targets[targetIndex];
                            targets[targetIndex] = 0;
                        }
                    }

                        break;
                        case "Shoot Right":
                            int startRightIndex = Integer.parseInt(commands[1]);
                            int rightLength = Integer.parseInt(commands[2]);
                            targetIndex = startRightIndex + rightLength;
                            if (startRightIndex < 0 || startRightIndex > targets.length - 1) {
                                break;
                            } else {
                                while (targetIndex > targets.length) {
                                    targetIndex = targetIndex - targets.length;
                                }
                                if (targets[targetIndex] >= 5) {
                                    targets[targetIndex] -= 5;
                                    points += 5;
                                } else {
                                    points += targets[targetIndex];
                                    targets[targetIndex] = 0;
                                }
                            }
                            break;
                        case "Reverse":
                            for (int i = 0; i < targets.length / 2; i++) {
                                int oldElement = targets[i];
                                targets[i] = targets[targets.length - 1 - i];
                                targets[targets.length - 1 - i] = oldElement;
                            }
                            break;
                    }
            input = scanner.nextLine();
            }

            System.out.print(targets[0]);
        for (int i = 1; i < targets.length ; i++) {
            System.out.print(" - " + targets[i]);

        }
             System.out.println();
            System.out.printf("Iskren finished the archery tournament with %d points!", points);
    }
}
