package SoftUniJavaProblemSolutions.Fundamentals.Exercise04_Methods;

import java.util.Scanner;

public class E0408FactorialDivision {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());


        double firstSum = calculateFactorial(firstNumber);
        double secondSum = calculateFactorial(secondNumber);

        double finalResult = firstSum/secondSum;

            System.out.printf("%.2f", finalResult);
            }

    static long calculateFactorial(int n) {
        long firstFactorial = 1;
        for (int i = 1; i <= n; i++) {
            // factorial = factorial * i;
            firstFactorial *= i;
        }
        return firstFactorial;
    }
}

