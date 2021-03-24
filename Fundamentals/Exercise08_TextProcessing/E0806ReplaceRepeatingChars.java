package SoftUniJavaProblemSolutions.Fundamentals.Exercise08_TextProcessing;

import java.util.Scanner;

public class E0806ReplaceRepeatingChars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder finalText = new StringBuilder(text);

        for (int i = text.length()-1; i > 0; i--) {

            if(text.charAt(i)==text.charAt(i-1)){

                finalText.replace(i-1,i, "");
            }
        }
        System.out.println(finalText);
    }
}
