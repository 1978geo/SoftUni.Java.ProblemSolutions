package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise04_ForLoop;

import java.util.Scanner;

public class Histogram2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfNumbers = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        for (int i = 0; i < countOfNumbers; i++) {

            int currentNumber = Integer.parseInt(scanner.nextLine());

            if (currentNumber > 0 && currentNumber < 200) {
                p1++;
            }
            if (currentNumber >= 200 && currentNumber < 400) {
                p2++;
            }
            if (currentNumber >= 400 && currentNumber < 600) {
                p3++;
            }
            if (currentNumber >= 600 && currentNumber < 800) {
                p4++;
            }
            if (currentNumber >= 800) {
                p5++;
            }
        }

        System.out.printf("%.2f%%%n", p1 / countOfNumbers * 100);
        System.out.printf("%.2f%%%n", p2 / countOfNumbers * 100);
        System.out.printf("%.2f%%%n", p3 / countOfNumbers * 100);
        System.out.printf("%.2f%%%n", p4 / countOfNumbers * 100);
        System.out.printf("%.2f%%", p5 / countOfNumbers * 100);

    }
}
