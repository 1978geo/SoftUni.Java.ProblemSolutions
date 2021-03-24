package SoftUniJavaProblemSolutions.Fundamentals.Exercise08_TextProcessing;

import java.util.Scanner;

public class Ex0802AsciiSumator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char first = scanner.nextLine().charAt(0);
        char last = scanner.nextLine().charAt(0);

        String[] symbols = scanner.nextLine().split("");

        int sum = 0;

        for (int i = first + 1; i < last; i++) {

            for (String symbol : symbols) {
                int newNum = symbol.charAt(0);
                if (newNum == i) {
                    sum += newNum;
                }
            }
        }
        System.out.println(sum);
    }
}
