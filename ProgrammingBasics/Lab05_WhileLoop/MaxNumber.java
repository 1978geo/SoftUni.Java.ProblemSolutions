package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab05_WhileLoop;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        int maxNumber = Integer.MIN_VALUE;

        while (!input.equals("Stop")) {

            int currentNumber = Integer.parseInt(input);

            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }

            input = scanner.nextLine();
        }
        System.out.printf("%d", maxNumber);
    }
}
