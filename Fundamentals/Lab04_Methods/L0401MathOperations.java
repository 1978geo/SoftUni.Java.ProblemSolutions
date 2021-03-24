package SoftUniJavaProblemSolutions.Fundamentals.Lab04_Methods;

import java.util.Scanner;

public class L0401MathOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double numberOne = Double.parseDouble(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);
        double numberTwo = Double.parseDouble(scanner.nextLine());

        double result = calculate(numberOne, symbol, numberTwo);

        System.out.printf("%.2f", result);

    }

    static double calculate(double numberOne, char symbol, double numberTwo) {
        double result = 0.0;

        switch (symbol) {
            case 1:
                symbol = '*';
                result = (numberOne * numberTwo);
                return result;
            case 2:
                symbol = '-';
                result = (numberOne - numberTwo);
                return result;
            case 3:
                symbol = '+';
                result = (numberOne + numberTwo);
                return result;
            case 4:
                symbol = '/';
                result = (numberOne / numberTwo);
                return result;

        }
        return result;
    }
}

