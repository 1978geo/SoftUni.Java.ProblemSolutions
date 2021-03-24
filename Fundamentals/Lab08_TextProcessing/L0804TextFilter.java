package SoftUniJavaProblemSolutions.Fundamentals.Lab08_TextProcessing;

import java.util.Scanner;

public class L0804TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split(", ");
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(text);

        for (int i = 0; i < info.length; i++) {
            String replaceWord = info[i];

            while (sb.indexOf(replaceWord) != -1) {
                int start = sb.indexOf(replaceWord);
                int end = sb.indexOf(replaceWord) + replaceWord.length();

                for (int j = start; j < end; j++) {
                    sb.setCharAt(j, '*');
                }
            }
        }
        System.out.println(sb);

    }

}
