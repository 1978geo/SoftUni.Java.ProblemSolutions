package SoftUniJavaProblemSolutions.Fundamentals.Exercise02_DataTypesAndVariables;

import java.util.Scanner;

public class E0206TriplesOfLatinLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            char firstChar = (char) ('a' + i);
            for (int j = 0; j < n; j++) {
                char secondChar = (char) ('a' + j);
                for (int k = 0; k < n; k++) {
                    char thirdChar = (char) ('a' + k);
                    for (int l = 0; l < n; l++) {
                        char fourthChar = (char) ('a' + l);
                        for (int m = 0; m < n; m++) {
                            char fifthChar = (char) ('a' + m);
                            System.out.printf("%c%c%c%c%c%n", firstChar, secondChar, thirdChar, fourthChar, fifthChar);
                        }
                    }

                }

            }

        }

    }
}
