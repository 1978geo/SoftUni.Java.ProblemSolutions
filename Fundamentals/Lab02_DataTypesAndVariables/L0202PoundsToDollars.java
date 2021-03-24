package SoftUniJavaProblemSolutions.Fundamentals.Lab02_DataTypesAndVariables;

import java.util.Scanner;

public class L0202PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double britishPound = Double.parseDouble(scanner.nextLine());;
        double usd = britishPound * 1.31;

        System.out.printf("%.3f", usd);

    }
}
