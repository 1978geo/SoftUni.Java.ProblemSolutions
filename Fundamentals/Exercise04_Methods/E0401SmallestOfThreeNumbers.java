package SoftUniJavaProblemSolutions.Fundamentals.Exercise04_Methods;

import java.util.Scanner;

public class E0401SmallestOfThreeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOne = Integer.parseInt(scanner.nextLine());
        int numberTwo = Integer.parseInt(scanner.nextLine());
        int numberThree = Integer.parseInt(scanner.nextLine());

        printSmallestNumber(numberOne, numberTwo, numberThree);

    }

    public static void printSmallestNumber(int numberOne, int numberTwo, int numberThree) {
        if ((Math.min(numberOne, numberTwo) < numberThree)) {
            System.out.printf("%d", Math.min(numberOne, numberTwo));
        } else
            System.out.printf("%d", numberThree);
    }
}
