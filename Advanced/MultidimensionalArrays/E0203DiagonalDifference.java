package SoftUniJavaProblemSolutions.Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E0203DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rowMatrix1 = Integer.parseInt(scanner.nextLine());

        int[][] firstMatrix = new int[rowMatrix1][];

        for (int row = 0; row < rowMatrix1; row++) {
            int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+")).
                    mapToInt(element -> Integer.parseInt(element)).toArray();
            for (int col = 0; col < rowMatrix1; col++) {
                firstMatrix[row] = arrays;
            }
        }
        int primaryDiagonal = 0;
        for (int i = 0; i < rowMatrix1; i++) {
            int currentValue = firstMatrix[i][i];
            primaryDiagonal += currentValue;

        }
        int secondaryDiagonal = 0;
        for (int i = rowMatrix1 - 1; i >= 0; i--) {
            int currentValue = firstMatrix[i][rowMatrix1 - 1 - i];
            secondaryDiagonal += currentValue;
        }

        System.out.println(Math.abs(primaryDiagonal - secondaryDiagonal));
    }
}
