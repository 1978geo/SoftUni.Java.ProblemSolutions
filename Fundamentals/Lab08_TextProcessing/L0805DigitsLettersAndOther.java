package SoftUniJavaProblemSolutions.Fundamentals.Lab08_TextProcessing;

import java.util.Scanner;

public class L0805DigitsLettersAndOther {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder letter = new StringBuilder();
        StringBuilder digit = new StringBuilder();
        StringBuilder symbol = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                digit.append(currentChar);

            } else if (Character.isLetter(currentChar)) {
                letter.append(currentChar);

            } else {
                symbol.append(currentChar);
            }
        }
        System.out.println(digit);
        System.out.println(letter);
        System.out.println(symbol);
    }
}
