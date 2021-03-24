package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab04_ForLoop;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNum = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < countNum; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if (max < currentNum) {
                max = currentNum;

            }
            if (min > currentNum) {
                min = currentNum;
            }

        }

        System.out.printf("Max number: %d%n", max);
        System.out.printf("Min number: %d", min);
    }
}
