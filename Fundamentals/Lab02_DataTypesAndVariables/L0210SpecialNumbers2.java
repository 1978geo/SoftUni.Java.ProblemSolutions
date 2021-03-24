package SoftUniJavaProblemSolutions.Fundamentals.Lab02_DataTypesAndVariables;

import java.util.Scanner;

public class L0210SpecialNumbers2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int givenNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        boolean isSpecialNum = false;

        for (int digit = 1; digit <= givenNumber; digit++) {

            int number = digit;
            while (digit > 0) {
                sum += digit % 10;
                digit = digit / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNum) {
                System.out.printf("%d -> True%n", number);
            } else {
                System.out.printf("%d -> False%n", number);
            }
            sum = 0;
            digit = number;

        }
    }
}
