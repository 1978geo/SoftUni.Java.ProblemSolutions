package SoftUniJavaProblemSolutions.Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class E0204MaximalSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] rowsColumnsFirstMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        int rowMatrix1 = rowsColumnsFirstMatrix[0];
        int colMatrix1 = rowsColumnsFirstMatrix[1];

        int[][] firstMatrix = new int[rowMatrix1][];

        for (int row = 0; row < rowMatrix1; row++) {
            int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+")).
                    mapToInt(element -> Integer.parseInt(element)).toArray();
            for (int col = 0; col < colMatrix1; col++) {
                firstMatrix[row] = arrays;
            }
        }
        int maxSum = Integer.MIN_VALUE;
        int[][] subMatrix = new int[3][3];
        for (int i = 0; i < rowMatrix1 - 2; i++) {

            for (int j = 0; j < colMatrix1 - 2; j++) {
                int currentSum = firstMatrix[i][j] + firstMatrix[i][j + 1] + firstMatrix[i][j + 2] +
            firstMatrix[i + 1][j] + firstMatrix[i + 1][j + 1] + firstMatrix[i + 1][j + 2] +
            firstMatrix[i + 2][j] + firstMatrix[i + 2][j + 1] + firstMatrix[i + 2][j + 2];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    subMatrix = new int[][]{
                            {firstMatrix[i][j], firstMatrix[i][j + 1], firstMatrix[i][j + 2]},
                            {firstMatrix[i + 1][j], firstMatrix[i + 1][j + 1], firstMatrix[i + 1][j + 2]},
                            {firstMatrix[i + 2][j], firstMatrix[i + 2][j + 1], firstMatrix[i + 2][j + 2]},
                    };
                }
            }
        }
        System.out.println("Sum = " + maxSum);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(subMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
