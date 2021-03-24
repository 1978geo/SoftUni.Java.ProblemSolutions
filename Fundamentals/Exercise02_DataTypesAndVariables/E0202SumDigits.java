package SoftUniJavaProblemSolutions.Fundamentals.Exercise02_DataTypesAndVariables;

import java.util.Scanner;

public class E0202SumDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int num = input.length();

        int sum = 0;

        for (int i = 0; i < num; i++) {
            int currentNum = (int) input.charAt(i) - 48;

            sum += currentNum;

        }

        System.out.printf("%d", sum);
    }
}
//You will be given a single integer. Your task is to find the sum of its digits.
//245678