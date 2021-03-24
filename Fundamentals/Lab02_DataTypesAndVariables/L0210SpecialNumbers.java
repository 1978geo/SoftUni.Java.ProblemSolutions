package SoftUniJavaProblemSolutions.Fundamentals.Lab02_DataTypesAndVariables;

import java.util.Scanner;

public class L0210SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= num; i++) {

            if (i >= 10) {
                int sum = i % 10 + i / 10;
                if (sum == 5 || sum == 7 || sum == 11) {
                    System.out.printf("%d -> True%n", i);
                } else {
                    System.out.printf("%d -> False%n", i);
                }
            }
            if (i < 10) {
                if (i == 5 || i == 7) {
                    System.out.printf("%d -> True%n", i);
                }
                if (i != 5 && i != 7) {
                    System.out.printf("%d -> False%n", i);
                }
            }
        }
    }
}

