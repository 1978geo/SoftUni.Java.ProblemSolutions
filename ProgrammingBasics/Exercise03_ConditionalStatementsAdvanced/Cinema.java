package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise03_ConditionalStatementsAdvanced;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeProjection = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        double totalIncome = 0;

        switch (typeProjection) {
            case "Premiere":
                System.out.printf("%.2f leva", totalIncome = rows * columns * 12.00);
                break;
            case "Normal":
                System.out.printf("%.2f leva", totalIncome = rows * columns * 7.50);
                break;
            case "Discount":
                System.out.printf("%.2f leva", totalIncome = rows * columns * 5.00);
                break;
            default:
                break;
        }

    }
}
