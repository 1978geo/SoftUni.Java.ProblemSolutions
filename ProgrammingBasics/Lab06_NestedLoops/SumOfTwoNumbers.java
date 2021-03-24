package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab06_NestedLoops;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        boolean isValid = false;
        int combinationCounter = 0;

            for (int i = number1; i <= number2; i++) {
            for (int j = number1; j <= number2; j++) {
                combinationCounter++;
                int sum = i + j;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", combinationCounter, i, j, sum);
                    isValid = true;

                    break;
                }
            }
            if (isValid) {
                break;
            }
        }
        if (!isValid) {
            System.out.printf(" %d combinations - neither equals %d",
                    combinationCounter, magicNumber);
        }
    }
}
