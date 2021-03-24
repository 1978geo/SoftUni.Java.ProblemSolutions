package SoftUniJavaProblemSolutions.Advanced.MultidimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class L0201CompareMatrices {
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
        int[] rowsColumnsSecondMatrix = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        int rowMatrix2 = rowsColumnsSecondMatrix[0];
        int colMatrix2 = rowsColumnsSecondMatrix[1];

        if(rowMatrix1!=rowMatrix2 || colMatrix1!=colMatrix2) {
            System.out.println("not equal");
        }
        else {

            int[][] secondMatrix = new int[rowMatrix2][];

            for (int row = 0; row < rowMatrix2; row++) {
                int[] arrays = Arrays.stream(scanner.nextLine().split("\\s+")).
                        mapToInt(element -> Integer.parseInt(element)).toArray();

                for (int col = 0; col < colMatrix2; col++) {

                   secondMatrix[row] = arrays;
                }
            }

            for (int i = 0; i < rowMatrix1; i++) {

                for (int j = 0; j < colMatrix1; j++) {

                    if(firstMatrix[i][j]!=secondMatrix[i][j]){
                        System.out.println("not equal");
                        return;
                    }

                }
            }
                System.out.println("equal");
        }
    }
}


