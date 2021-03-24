package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab05_WhileLoop;

import java.util.Scanner;

public class SumNumbersWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int number = Integer.parseInt(scanner.nextLine());

        int sumNumbers = 0;

        while (sumNumbers < number) {

            int countNumber = Integer.parseInt(scanner.nextLine());
            sumNumbers += countNumber;

        }
        System.out.println(sumNumbers);

    }
}
