package SoftUniJavaProblemSolutions.Fundamentals.Exercise04_Methods;

import java.util.Scanner;

public class E0405AddAndSubtract {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sumResult = sumFirstTwoNumbers(firstNumber, secondNumber);

        int finalResult = subtractResult(sumResult, thirdNumber);

        System.out.printf("%d", finalResult);
    }

    static int sumFirstTwoNumbers(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    static int subtractResult(int sumResult, int thirdNumber) {
        return sumResult - thirdNumber;
    }
}
