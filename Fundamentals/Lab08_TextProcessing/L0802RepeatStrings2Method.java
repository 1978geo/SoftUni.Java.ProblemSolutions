package SoftUniJavaProblemSolutions.Fundamentals.Lab08_TextProcessing;

import java.util.Scanner;

public class L0802RepeatStrings2Method {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split(" ");

        for (String s : info) {
            System.out.print(repeat(s, s.length()));
        }
    }
    private static String repeat (String word, int count) {
        String [] repeatArr = new String[count];
        for (int i = 0; i < count; i++) {
            repeatArr [i] = word;
        }
        return String.join("", repeatArr);
    }
}
