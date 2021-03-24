package SoftUniJavaProblemSolutions.ProgrammingBasics.ExamPrep;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double luggageCapacity = Double.parseDouble(scanner.nextLine());

        String input = scanner.nextLine();


        int luggageCounter = 1;
        while (!input.equals("End")) {
            double currentLuggageVolume = Double.parseDouble(input);

            if (luggageCounter % 3 == 0) {
                currentLuggageVolume = currentLuggageVolume * 1.10;
            }

            luggageCapacity = luggageCapacity - currentLuggageVolume;


            if (luggageCapacity < 0) {
                System.out.println("No more space!");
                break;
            }

            luggageCounter++;

            input = scanner.nextLine();
        }

        if (input.equals("End")) {
            if (luggageCapacity < 0) {
                System.out.println("No more space!");
            } else {
                System.out.println("Congratulations! All suitcases are loaded!");
            }
        }
        System.out.printf("Statistic: %d suitcases loaded.", luggageCounter - 1);
    }
}

