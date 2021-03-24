package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise04_ForLoop;

import java.util.Scanner;

public class DivideWithoutRemainder2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;


        for (int i = 0; i < n; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber % 2 == 0) {
                p1 += 1;
            }
            if (currentNumber % 3 == 0) {
                p2 += 1;
            }
            if (currentNumber % 4 == 0) {
                p3 += 1;
            }

        }
        System.out.printf("%.2f%%%n", p1 * 1.0 / n * 100);
        System.out.printf("%.2f%%%n", p2 * 1.0 / n * 100);
        System.out.printf("%.2f%%", p3 * 1.0 / n * 100);
    }
}
