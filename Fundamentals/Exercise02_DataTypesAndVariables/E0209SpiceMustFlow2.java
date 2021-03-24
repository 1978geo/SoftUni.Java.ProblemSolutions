package SoftUniJavaProblemSolutions.Fundamentals.Exercise02_DataTypesAndVariables;

import java.util.Scanner;

public class E0209SpiceMustFlow2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int totalSum = 0;
        int days = 0;

        while (startingYield>=100) {

            totalSum += (startingYield) - 26;
            days++;
            startingYield -=10;
        }

        if (totalSum >= 26) {
            totalSum -=26;

        }
        System.out.println(days);
        System.out.printf("%d", (totalSum));

    }
}
