package SoftUniJavaProblemSolutions.Fundamentals.Exercise04_Methods;

import java.util.Scanner;

public class E0402VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printVowelsCount(input);
    }

    static void printVowelsCount(String input) {

        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'o'
                    || ch == 'u' || ch == 'i' || ch == 'A' || ch == 'E' || ch == 'O'
                    || ch == 'U' || ch == 'I' ) {
                vowelCount++;
            }
        }
        System.out.print(vowelCount);
    }
}
