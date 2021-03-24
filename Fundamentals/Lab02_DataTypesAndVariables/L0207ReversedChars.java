package SoftUniJavaProblemSolutions.Fundamentals.Lab02_DataTypesAndVariables;

import java.util.Scanner;

public class L0207ReversedChars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char firstLine = scanner.nextLine().charAt(0);
        char secondLine = scanner.nextLine().charAt(0);
        char thirdLine = scanner.nextLine().charAt(0);

        System.out.printf("%c %c %c", thirdLine, secondLine, firstLine);

    }
}
