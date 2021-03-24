package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab04_ForLoop;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int textLength = text.length();

        for (int i = 0; i < text.length(); i++) {

            char letter = text.charAt(i);
            System.out.println(letter);
        }

    }
}
