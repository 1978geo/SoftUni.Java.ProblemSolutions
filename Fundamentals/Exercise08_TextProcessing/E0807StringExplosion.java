package SoftUniJavaProblemSolutions.Fundamentals.Exercise08_TextProcessing;

import java.util.Scanner;

public class E0807StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder newText = new StringBuilder(text);
        int strength = 0;

        for (int i = 0; i < newText.length(); i++) {

            if (newText.charAt(i) == '>') {
                int addition = Character.getNumericValue(newText.charAt(i + 1));
                strength += addition;
            } else if (strength > 0 && newText.charAt(i) != '>') {
                newText.deleteCharAt(i);
                strength--;
                i--;
            }
        }
        System.out.println(newText);
    }
}
