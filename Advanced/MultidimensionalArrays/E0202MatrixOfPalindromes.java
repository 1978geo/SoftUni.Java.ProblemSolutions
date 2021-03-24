package SoftUniJavaProblemSolutions.Advanced.MultidimensionalArrays;

import java.util.Scanner;

public class E0202MatrixOfPalindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        int r = Integer.parseInt(tokens[0]);
        int c = Integer.parseInt(tokens[1]);

        String[][] matrix = fillMatrix(r, c);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(String.format("%s ", element));
            }
            System.out.println();
        }
    }

    private static String[][] fillMatrix(int r, int c) {
        String[][] matrix = new String[r][c];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                if (j == 0) {
                    char rowSymbol = (char) (i + 97);
                    char colSymbol = (char) (j + 97);
                    String currentPalindrome = String.valueOf(rowSymbol) + String.valueOf(rowSymbol) +
                            String.valueOf(rowSymbol);
                    matrix[i][j] = currentPalindrome;
                } else {
                    char rowSymbol = (char) (i + 97);
                    char colSymbol = (char) (i + j + 97);
                    String currentPalindrome = String.valueOf(rowSymbol) + String.valueOf(colSymbol) +
                            String.valueOf(rowSymbol);
                    matrix[i][j] = currentPalindrome;
                }
            }
        }
        return matrix;
    }
}
