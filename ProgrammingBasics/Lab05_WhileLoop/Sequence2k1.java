package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab05_WhileLoop;

import java.util.Scanner;

public class Sequence2k1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int number = 1;

        while (number <= n) {

            System.out.println(number);

            number = 2 * number + 1;

        }

    }

}
