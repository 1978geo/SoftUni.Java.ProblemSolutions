package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberN1 = Integer.parseInt(scanner.nextLine());
        int numberN2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;

        switch (operator) {
            case "+":
                result = numberN1 + numberN2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", numberN1, operator, numberN2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", numberN1, operator, numberN2, result);
                }
                break;
            case "-":
                result = numberN1 - numberN2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", numberN1, operator, numberN2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", numberN1, operator, numberN2, result);
                }
                break;
            case "*":
                result = numberN1 * numberN2;
                if (result % 2 == 0) {
                    System.out.printf("%d %s %d = %.0f - even", numberN1, operator, numberN2, result);
                } else {
                    System.out.printf("%d %s %d = %.0f - odd", numberN1, operator, numberN2, result);
                }
                break;
            case "/":
                if (numberN2 == 0) {
                    System.out.printf("Cannot divide %d by zero", numberN1);
                } else {
                    result = numberN1 * 1.0 / numberN2;
                    System.out.printf("%d %s %d = %.2f ", numberN1, operator, numberN2, result);
                }
                break;
            case "%":
                if (numberN2 == 0) {
                    System.out.printf("Cannot divide %d by zero", numberN1);
                } else {
                    result = numberN1 % numberN2;
                    System.out.printf("%d %s %d = %.0f", numberN1, operator, numberN2, result);
                }
                break;
        }
    }
}

