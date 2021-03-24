package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Arrays;
import java.util.Scanner;

public class ExamPrepE03HeartDelivery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] hearts = Arrays.stream(scanner.nextLine().split("@")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        String input = scanner.nextLine();
        int temporaryJump = 0;
        int counter = 0;
        while (!input.equals("Love!")) {
            String[] commands = input.split("\\s+");
            String order = commands[0];
            int jump = Integer.parseInt(commands[1]);
            temporaryJump += jump;
            if (temporaryJump > hearts.length - 1) {
                temporaryJump = 0;
            }
            switch (order) {

                case "Jump":
                    if (hearts[temporaryJump] == 0) {
                        System.out.printf("Place %d already had Valentine's day.%n", temporaryJump);
                        break;
                    }
                    hearts[temporaryJump] = hearts[temporaryJump] - 2;
                    if (hearts[temporaryJump] == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", temporaryJump);
                        counter++;
                    }
            }
            input = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", temporaryJump);
        if (counter == hearts.length) {
            System.out.print("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.", hearts.length - counter);
        }
    }
}
