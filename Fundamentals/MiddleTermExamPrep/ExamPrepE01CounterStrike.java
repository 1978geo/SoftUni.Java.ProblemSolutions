package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Scanner;

public class ExamPrepE01CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int counter = 0;
        int temporaryEnergy = initialEnergy;

        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (temporaryEnergy-distance < 0) {

                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", counter, temporaryEnergy);
               return;
            }
            temporaryEnergy -= distance;
            counter++;
            if (counter % 3 == 0) {
                temporaryEnergy += counter;
            }
            input = scanner.nextLine();
        }

        if (temporaryEnergy >= 0 ) {
            System.out.printf("Won battles: %d. Energy left: %d", counter, temporaryEnergy);
        }
    }
}
