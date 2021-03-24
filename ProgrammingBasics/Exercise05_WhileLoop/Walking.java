package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise05_WhileLoop;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sumNumberSteps = 0;

        while (!input.equals("Going home")) {

            int currentNumberSteps = Integer.parseInt(input);
            sumNumberSteps += currentNumberSteps;

            if (sumNumberSteps >= 10000) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", Math.abs(sumNumberSteps - 10000));
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Going home")) {
            input = scanner.nextLine();
            int currentNumberSteps = Integer.parseInt(input);

            int diff = sumNumberSteps + currentNumberSteps - 10000;
            if (diff >= 0) {
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", diff);
            } else {
                System.out.printf("%d more steps to reach goal.", Math.abs(diff));
            }
        }
    }
}
