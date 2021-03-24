package SoftUniJavaProblemSolutions.Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class L0202PositionsOf {
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
        int givenNumber = Integer.parseInt(scanner.nextLine());
        int givenCounter = 0;

        for (int i = 0; i < rowMatrix1; i++) {

            for (int j = 0; j < colMatrix1; j++) {

                if (givenNumber == firstMatrix[i][j]) {
                    System.out.println(i + " " + j);
                    givenCounter++;
                }
            }
        }
        if (givenCounter == 0) {
            System.out.println("not found");
        }
    }
}
