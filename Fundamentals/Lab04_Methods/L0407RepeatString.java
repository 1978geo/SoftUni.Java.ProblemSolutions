package SoftUniJavaProblemSolutions.Fundamentals.Lab04_Methods;

import java.util.Scanner;

public class L0407RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        String repeated = repeatString(inputStr, count);
        System.out.println(repeated);
    }

    private static String repeatString(String inputStr, int count) {
        String[] repetitions = new String[count];

        for (int i = 0; i < count; i++) {
            repetitions[i] = inputStr;
        }
        String repeated = String.join("", repetitions);
        return repeated;
    }

}

