package SoftUniJavaProblemSolutions.Advanced.MultidimensionalArrays;

import java.util.Scanner;

public class E0201FillTheMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(", ");

        int n = Integer.parseInt(tokens[0]);
        String fillPattern = tokens[1];

        int[][] matrix = fillMatrix(n, fillPattern);
        printMatrix(matrix);

    }

    private static int[][] fillMatrix(int n, String fillPattern) {
        int[][] matrix = new int[n][n];
        if (fillPattern.equals("A")) {
            fillPatternA(matrix);

        } else if (fillPattern.equals("B")) {
            fillPatternB(matrix);
        }

        return matrix;
    }

    private static void fillPatternB(int[][] matrix) {

        int number = 1;

        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[j][i] = number;
                    number++;
                }
            } else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    matrix[j][i] = number;
                    number++;
                }
            }

        }
    }

    private static void fillPatternA(int[][] matrix) {
        int number = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][i] = number;
                number++;

            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(String.format("%d ", element));
            }
            System.out.println();
        }
    }
}
