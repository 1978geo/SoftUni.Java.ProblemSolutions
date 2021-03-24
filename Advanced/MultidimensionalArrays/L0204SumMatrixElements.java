package SoftUniJavaProblemSolutions.Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class L0204SumMatrixElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] rowsColumnsFirstMatrix = Arrays.stream(scanner.nextLine().split(", ")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        int rowMatrix1 = rowsColumnsFirstMatrix[0];
        int colMatrix1 = rowsColumnsFirstMatrix[1];

        int[][] firstMatrix = new int[rowMatrix1][];
        int sum = 0;
        for (int row = 0; row < rowMatrix1; row++) {
            int[] arrays = Arrays.stream(scanner.nextLine().split(", ")).
                    mapToInt(element -> Integer.parseInt(element)).toArray();
            for (int col = 0; col < colMatrix1; col++) {
                firstMatrix[row] = arrays;
                int currentSum = firstMatrix[row][col];
                sum += currentSum;
            }
        }
        System.out.println(rowMatrix1);
        System.out.println(colMatrix1);
        System.out.println(sum);
    }
}
