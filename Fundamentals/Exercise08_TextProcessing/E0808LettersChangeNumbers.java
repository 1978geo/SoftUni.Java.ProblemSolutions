package SoftUniJavaProblemSolutions.Fundamentals.Exercise08_TextProcessing;

import java.util.Scanner;

public class E0808LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split("\\s+");

        double sum = 0;

        for (String currentStr : info) {

            String innerNumber = currentStr.substring(1, currentStr.length() - 1);
            int insideNumber = Integer.parseInt(innerNumber);
            char currentFirstChar = currentStr.charAt(0);
            char currentLastChar = currentStr.charAt(currentStr.length() - 1);
            int firstNumber = Character.getNumericValue(currentFirstChar) - 9;
            int secondNumber = Character.getNumericValue(currentLastChar) - 9;

            if (Character.isLowerCase(currentFirstChar)) {
                sum += firstNumber * insideNumber;
            } else {
                sum += insideNumber * 1.0 / firstNumber;
            }

            if (Character.isLowerCase(currentLastChar)) {
                sum += secondNumber;
            } else {
                sum -= secondNumber;
            }
        }
        System.out.printf("%.2f", sum);
    }
}
