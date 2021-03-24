package SoftUniJavaProblemSolutions.Fundamentals.Exercise04_Methods;

import java.util.Scanner;

public class E0409PalindromeIntegers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            printPalindromeResult(input);

            input = scanner.nextLine();
        }
    }

    static void printPalindromeResult(String input) {
        String[] stringAsArray = input.split("");
        int[] number = new int[input.length()];

        for (int i = 0; i < input.length(); i++) {
            int digit = Integer.parseInt(stringAsArray[i]);
            int newDigit = Integer.parseInt(stringAsArray[input.length() - 1 - i]);
            if (digit == newDigit) {
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }
        }
    }
}
