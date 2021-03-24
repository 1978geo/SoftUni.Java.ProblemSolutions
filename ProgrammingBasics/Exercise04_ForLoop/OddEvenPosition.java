package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise04_ForLoop;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMax = Integer.MIN_VALUE;
        double oddMin = Integer.MAX_VALUE;
        double evenSum = 0;
        double evenMax = Integer.MIN_VALUE;
        double evenMin = Integer.MAX_VALUE;

        for (int i = 1; i <= n; i++) {

            double currentNum = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum += currentNum;
                if (evenMax < currentNum) {
                    evenMax = currentNum;
                }
                if (evenMin > currentNum) {
                    evenMin = currentNum;
                }
            } else {
                oddSum += currentNum;
                if (oddMax < currentNum) {
                    oddMax = currentNum;
                }
                if (oddMin > currentNum) {
                    oddMin = currentNum;
                }
            }

        }
        System.out.printf("OddSum=%.2f,%n", oddSum);

        if (oddMin == Integer.MAX_VALUE) {
            System.out.println("OddMin=No,");
        } else {
            System.out.printf("OddMin=%.2f,%n", oddMin);
        }
        if (oddMax == Integer.MIN_VALUE) {
            System.out.println("OddMax=No,");
        } else {
            System.out.printf("OddMax=%.2f,%n", oddMax);
        }

        System.out.printf("EvenSum=%.2f,%n", evenSum);

        if (evenMin == Integer.MAX_VALUE) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.printf("EvenMin=%.2f,%n", evenMin);
        }
        if (evenMax == Integer.MIN_VALUE) {
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("EvenMax=%.2f", evenMax);
        }
    }
}

