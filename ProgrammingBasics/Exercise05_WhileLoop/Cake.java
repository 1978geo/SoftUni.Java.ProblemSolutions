package SoftUniJavaProblemSolutions.ProgrammingBasics.Exercise05_WhileLoop;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cakeWidth = Integer.parseInt(scanner.nextLine());
        int cakeLength = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int totalPieces = cakeLength * cakeWidth;

        int sumNumberPieces = 0;
        while (!input.equals("STOP")) {
            int currentNumberPieces = Integer.parseInt(input);
            sumNumberPieces += currentNumberPieces;

            if (totalPieces <= sumNumberPieces) {
                System.out.printf("No more cake left! You need %d pieces more.",
                        Math.abs(totalPieces - sumNumberPieces));
                break;
            }

            input = scanner.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%s pieces are left.", Math.abs(sumNumberPieces - totalPieces));
        }
    }
}
