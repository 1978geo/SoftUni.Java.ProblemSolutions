package SoftUniJavaProblemSolutions.Fundamentals.Exercise04_Methods;

import java.util.Scanner;

public class E0407NxNMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printFirstLine(input);

        for (int i = 0; i < Integer.parseInt(input)-1; i++) {
            printFirstLine(input);
        }
    }
    static void printFirstLine(String input) {
        int[] numbers = new int[Integer.parseInt(input)];

        for (int i = 0; i < Integer.parseInt(input); i++) {
            numbers[i] = Integer.parseInt(input);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
