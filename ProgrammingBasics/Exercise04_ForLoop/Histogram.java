package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise04_ForLoop;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;

        for (int i = 1; i <= n; i++) {

            int currentNum = Integer.parseInt(scanner.nextLine());

            if (currentNum >= 1 && currentNum < 200) {
                p1 += 1;
            }
            if (currentNum >= 200 && currentNum < 400) {
                p2 += 1;
            }
            if (currentNum >= 400 && currentNum < 600) {
                p3 += 1;
            }
            if (currentNum >= 600 && currentNum < 800) {
                p4 += 1;
            }
            if (currentNum >= 800) {
                p5 += 1;
            }

        }

        System.out.printf("%.2f%%%n", (p1 * 1.0 / n * 100));
        System.out.printf("%.2f%%%n", (p2 * 1.0 / n * 100));
        System.out.printf("%.2f%%%n", (p3 * 1.0 / n * 100));
        System.out.printf("%.2f%%%n", (p4 * 1.0 / n * 100));
        System.out.printf("%.2f%%", (p5 * 1.0 / n * 100));
    }
}
