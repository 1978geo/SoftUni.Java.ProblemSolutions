package SoftUniJavaProblemSolutions.ProgrammingBasics.ExamPrep;

import java.util.Scanner;

public class SuitcasesLoad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trunkCapacity = Double.parseDouble(scanner.nextLine());

        String inputLine = scanner.nextLine();

        boolean isFull = false;
        int countSuitcase = 1;
        while (!inputLine.equals("End")){
            double volumeSuitcase = Double.parseDouble(inputLine);

            if (countSuitcase % 3 == 0){
                volumeSuitcase = volumeSuitcase * 1.10;
            }

            trunkCapacity = trunkCapacity - volumeSuitcase;

            if (trunkCapacity < 0){
                isFull = true;
                break;
            }

            countSuitcase++;

            inputLine = scanner.nextLine();
        }

        if (isFull){
            System.out.println("No more space!");
        } else {
            System.out.println("Congratulations! All suitcases are loaded!");
        }

        System.out.printf("Statistic: %d suitcases loaded.", countSuitcase - 1);
    }
}

