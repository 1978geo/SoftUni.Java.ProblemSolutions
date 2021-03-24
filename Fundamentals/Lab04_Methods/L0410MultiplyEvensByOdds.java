package SoftUniJavaProblemSolutions.Fundamentals.Lab04_Methods;

import java.util.Scanner;

public class L0410MultiplyEvensByOdds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n < 0) {
            n = Math.abs(n);
        }

        int result = getMultipleOfEvensAndOdds(n);

        System.out.print(result);
    }

    static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = getEvenSum(n);
        int oddSum = getOddSum(n);
        return evenSum * oddSum;
    }

    static int getEvenSum(int n) {

        int evenSum = 0;
        while (n > 0) {
            if (((n % 10) % 2) == 0) {
                evenSum += n % 10;
            }
            n = n / 10;
        }
        return evenSum;
    }

    static int getOddSum(int n) {
        int oddSum = 0;
        while (n > 0) {
            if (((n % 10) % 2) != 0) {
                oddSum += n % 10;
            }
            n = n / 10;
        }
        return oddSum;
    }
}
