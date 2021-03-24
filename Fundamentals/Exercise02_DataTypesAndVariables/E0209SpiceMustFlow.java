package SoftUniJavaProblemSolutions.Fundamentals.Exercise02_DataTypesAndVariables;

import java.util.Scanner;

public class E0209SpiceMustFlow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int days = 0;

        for (int i = startingYield; i >= 100; i -= 10) {
            days++;
            sum += (i) - 26;
        }

        if (sum >= 26) {
            sum -=26;

        }
        System.out.println(days);
        System.out.printf("%d", (sum));
    }
}
