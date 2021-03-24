package SoftUniJavaProblemSolutions.Advanced.MultidimensionalArrays;

import java.util.Scanner;

public class L0203IntersectionOfTwoMatrices {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int mRow = Integer.parseInt(scanner.nextLine());
        int nCol = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[mRow][nCol];
        char[][] secondMatrix = new char[mRow][nCol];

        for (int i = 0; i < mRow; i++) {
            char[] input = scanner.nextLine().replaceAll("\\s+", "").toCharArray();

            for (int j = 0; j < nCol; j++) {
                firstMatrix[i] = input;
            }
        }
        for (int i = 0; i < mRow; i++) {
            char[] input = scanner.nextLine().replaceAll("\\s+", "").toCharArray();

            for (int j = 0; j < nCol; j++) {
                secondMatrix[i] = input;
            }
        }
        char[][] thirdMatrix = new char[mRow][nCol];
        for (int i = 0; i < mRow; i++) {

            for (int j = 0; j < nCol; j++) {
                if (firstMatrix[i][j] == secondMatrix[i][j]) {
                    thirdMatrix[i][j] = firstMatrix[i][j];
                } else {
                    thirdMatrix[i][j] = '*';
                }
                System.out.print(thirdMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
