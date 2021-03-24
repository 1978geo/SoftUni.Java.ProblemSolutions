package SoftUniJavaProblemSolutions.Fundamentals.Lab04_Methods;

import java.util.Scanner;

public class L0403PrintingTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        printTriangle(Integer.parseInt(scanner.nextLine()));

    }
    static void printToLine(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printTriangle(int n) {
        for (int line = 1; line <= n; line++)
            printToLine(1, line);

        for (int line = n - 1; line >= 1; line--)
            printToLine(1, line);
    }
}
