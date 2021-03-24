package SoftUniJavaProblemSolutions.Fundamentals.Exercise04_Methods;

import java.util.Scanner;

public class E0403CharactersInRange {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);

        printMiddleCharacters(start, end);

    }

    static void printMiddleCharacters(char start, char end) {

        if (start < end) {
            for (int i = start + 1; i < end; i++) {

                char ch = (char) i;

                System.out.print(ch + " ");
            }
        } else {

            for (int i = end + 1; i < start; i++) {

                char ch = (char) i;

                System.out.print(ch + " ");
            }
        }
    }
}
