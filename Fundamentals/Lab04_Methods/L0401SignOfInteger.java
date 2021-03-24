package SoftUniJavaProblemSolutions.Fundamentals.Lab04_Methods;

import java.util.Scanner;

public class L0401SignOfInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printSign(Integer.parseInt(scanner.nextLine()));

    }

    static void printSign(int number) {
        if (number < 0) {
            System.out.printf("The number %d is negative.", number);
        } else if (number == 0) {
            System.out.print("The number 0 is zero.");
        } else {
            System.out.printf("The number %d is positive.", number);
        }

    }
}
