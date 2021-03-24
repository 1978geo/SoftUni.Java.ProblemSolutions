package SoftUniJavaProblemSolutions.Fundamentals.Lab08_TextProcessing;

import java.util.Scanner;

public class L0803Substring {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String textToRemove = scanner.nextLine();
        String originalText = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(originalText);

        while (sb.indexOf(textToRemove) != -1) {
            int start = sb.indexOf(textToRemove);
            int end = sb.indexOf(textToRemove) + textToRemove.length();
            sb.replace(start, end, "");
        }

        System.out.println(sb);
    }
}
