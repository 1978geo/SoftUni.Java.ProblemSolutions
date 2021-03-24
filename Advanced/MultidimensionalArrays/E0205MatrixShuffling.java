package SoftUniJavaProblemSolutions.Advanced.MultidimensionalArrays;

import java.util.Scanner;

public class E0205MatrixShuffling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");

        int r = Integer.parseInt(tokens[0]);
        int c = Integer.parseInt(tokens[1]);

        String[][] matrix = fillMatrix(scanner, r, c);

        String[] info = scanner.nextLine().split("\\s+");

        while (!info[0].equals("END")) {
            if (info.length != 5) {
                System.out.println("Invalid input!");
                info = scanner.nextLine().split("\\s+");
                continue;
            } else {
                if (info[0].equals("swap")) {
                    int row1 = Integer.parseInt(info[1]);
                    int col1 = Integer.parseInt(info[2]);
                    int row2 = Integer.parseInt(info[3]);
                    int col2 = Integer.parseInt(info[4]);

                    if (row1 >= 0 && row1 <= r && row2 >= 0 && row2 <= r &&
                            col1 >= 0 && col1 <= r && col2 >= 0 && col2 <= c) {

                        String given1 = matrix[row1][col1];
                        String currentSwap = given1;
                        String given2 = matrix[row2][col2];
                        matrix[row1][col1] = given2;
                        matrix[row2][col2] = currentSwap;
                    } else {
                        System.out.println("Invalid input!");
                        info = scanner.nextLine().split("\\s+");
                        continue;
                    }
                }
            }
            printMatrix(matrix);
            info = scanner.nextLine().split("\\s+");
        }
    }

    public static String[][] fillMatrix(Scanner scanner, int r, int c) {
        String[][] matrix = new String[r][c];
        for (int i = 0; i < r; i++) {
            String[] info = scanner.nextLine().split("\\s+");

            for (int j = 0; j < c; j++) {
                matrix[i] = info;
            }
        }
        return matrix;
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] row : matrix) {
            for (String element : row) {
                System.out.print(String.format("%s ", element));
            }
            System.out.println();
        }
    }
}
