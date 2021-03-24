package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise04_ForLoop;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countNum = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < countNum; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum += currentNum;
            if (max < currentNum) {
                max = currentNum;
            }
        }
        int sumWithouthMaxNumber = sum - max;

        if (max == sumWithouthMaxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", max);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d", Math.abs(max - sumWithouthMaxNumber));
        }
    }
}


