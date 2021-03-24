package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class EnergyBooster {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String fruit = scanner.nextLine();
            String size = scanner.nextLine();
            int countSets = Integer.parseInt(scanner.nextLine());

            double sumSingleSet = 0;
            if (size.equals("small")){
                if (fruit.equals("Watermelon")){
                    sumSingleSet = 56 * 2;
                } else if (fruit.equals("Mango")){
                    sumSingleSet = 36.66 * 2;
                } else if (fruit.equals("Pineapple")){
                    sumSingleSet = 42.10 * 2;
                } else {
                    sumSingleSet = 20 * 2;
                }

            } else if (size.equals("big")){
                if (fruit.equals("Watermelon")){
                    sumSingleSet = 28.70 * 5;
                } else if (fruit.equals("Mango")){
                    sumSingleSet = 19.60 * 5;
                } else if (fruit.equals("Pineapple")){
                    sumSingleSet = 24.80 * 5;
                } else {
                    sumSingleSet = 15.20 * 5;
                }
            }

            double resultAllSets = countSets * sumSingleSet;

            if (resultAllSets >= 400 && resultAllSets <= 1000){
                resultAllSets = resultAllSets * 0.85;
            } else if (resultAllSets > 1000){
                resultAllSets = resultAllSets * 0.50;
            }

            System.out.printf("%.2f lv.", resultAllSets);
        }
    }

