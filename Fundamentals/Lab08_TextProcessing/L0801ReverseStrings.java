package SoftUniJavaProblemSolutions.Fundamentals.Lab08_TextProcessing;

import java.util.Scanner;

public class L0801ReverseStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        // 01234
        // hello

        while (!input.equals("end")) {
            String currentWord = input;
            StringBuilder sb = new StringBuilder();
            String newWord = "";

            for (int i = currentWord.length() - 1; i >= 0; i--) {
                char letter = currentWord.charAt(i);
                sb.append(letter);
            }
            System.out.printf("%s = %s%n", currentWord, sb);

            input = scanner.nextLine();
        }
    }
}
