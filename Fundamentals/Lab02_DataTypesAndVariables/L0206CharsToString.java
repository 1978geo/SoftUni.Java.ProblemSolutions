package SoftUniJavaProblemSolutions.Fundamentals.Lab02_DataTypesAndVariables;

import java.util.Scanner;

public class L0206CharsToString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        System.out.print(first+""+second+""+third);

    }
}
