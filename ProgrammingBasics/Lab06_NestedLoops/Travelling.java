package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab06_NestedLoops;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String destination = "";

        while(!input.equals("End")) {
            destination = input;
            double minTravelBudget = Double.parseDouble(scanner.nextLine());
            double savedSum = 0;
            while (true) {
                if (savedSum >= minTravelBudget) {
                    System.out.printf("Going to %s!%n", destination);
                    break;
                }
                double currentSavedSum = Double.parseDouble(scanner.nextLine());;
                savedSum += currentSavedSum;
            }

                input = scanner.nextLine();
            }

    }
}
