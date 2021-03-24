package SoftUniJavaProblemSolutions.Fundamentals.Lab04_Methods;

import java.util.Scanner;

public class L0404Calculations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());

        if (input.equals("add")) {
            addCalculation(numberOne, numberTwo);
        } else if (input.equals("multiply")) {
            multiplyCalculation(numberOne, numberTwo);
        } else if (input.equals("subtract")) {
            subtractCalculation(numberOne, numberTwo);
        } else if (input.equals("divide")) {
            divideCalculation(numberOne, numberTwo);
        }
    }

    static void addCalculation(int numberOne, int numberTwo) {
        int result = numberOne + numberTwo;
        System.out.println(result);
    }

    static void multiplyCalculation(int numberOne, int numberTwo) {
        int result = numberOne * numberTwo;
        System.out.println(result);
    }

    static void subtractCalculation(int numberOne, int numberTwo) {
        int result = numberOne - numberTwo;
        System.out.println(result);
    }

    static void divideCalculation(int numberOne, int numberTwo) {
        int result = numberOne / numberTwo;
        System.out.println(result);
    }
}

