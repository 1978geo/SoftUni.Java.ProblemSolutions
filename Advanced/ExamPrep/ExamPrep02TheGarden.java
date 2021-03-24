package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.Scanner;

public class ExamPrep02TheGarden {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[rows][];
        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            matrix[row] = line;
        }
        String input;
        int carrots = 0;
        int potatoes = 0;
        int lettuce = 0;
        int harmedVeg = 0;


        while (!"End of Harvest".equals(input = scanner.nextLine())) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            int row = Integer.parseInt(tokens[1]);
            int col = Integer.parseInt(tokens[2]);

            if (command.equals("Harvest")) {
                if (!isOutOfBound(matrix, row, col)) {
                    String vegetable = matrix[row][col];
                    switch (vegetable) {
                        case "C":
                            carrots++;
                            break;
                        case "P":
                            potatoes++;
                            break;
                        case "L":
                            lettuce++;
                            break;
                    }
                    matrix[row][col] = " ";
                }
            } else {
                if (!isOutOfBound(matrix, row, col)) {
                    String direction = tokens[3];
                    switch (direction) {
                        case "up":
                            harmedVeg += moleVegetablesUp(matrix, row, col);
                            break;
                        case "down":
                            harmedVeg += moleVegetablesDown(matrix, row, col);
                            break;
                        case "left":
                            harmedVeg += moleVegetablesLeft(matrix, row, col);
                            break;
                        case "right":
                            harmedVeg += moleVegetablesRight(matrix, row, col);
                            break;
                    }
                }
            }
        }
        printMatrix(matrix);

        System.out.printf("Carrots: %d%nPotatoes: %d%nLettuce: %d%nHarmed vegetables: %d%n", carrots,
                potatoes, lettuce, harmedVeg);
    }

    private static int moleVegetablesUp(String[][] matrix, int row, int col) {
        int harmedVeg = 0;
        for (int i = row; row >= 0; ) {
            if (!isOutOfBound(matrix, row, col)) {
                if (!matrix[row][col].equals(" ")) {
                    matrix[row][col] = " ";
                    harmedVeg++;
                }
            }
            row -= 2;
        }
        return harmedVeg;
    }

    public static int moleVegetablesDown(String[][] matrix, int row, int col) {
        int harmedVeg = 0;
        for (int i = row; row < matrix.length; ) {
            if (!isOutOfBound(matrix, row, col)) {
                if (!matrix[row][col].equals(" ")) {
                    matrix[row][col] = " ";
                    harmedVeg++;
                }
            }
            row += 2;
        }
        return harmedVeg;
    }

    public static int moleVegetablesLeft(String[][] matrix, int row, int col) {
        int harmedVeg = 0;
        for (int i = col; col >= 0; ) {
            if (!isOutOfBound(matrix, row, col)) {
                if (!matrix[row][col].equals(" ")) {
                    matrix[row][col] = " ";
                    harmedVeg++;
                }
            }
            col -= 2;
        }
        return harmedVeg;
    }

    public static int moleVegetablesRight(String[][] matrix, int row, int col) {
        int harmedVeg = 0;
        for (int i = col; col < matrix[row].length; ) {
            if (!isOutOfBound(matrix, row, col)) {
                if (!matrix[row][col].equals(" ")) {
                    matrix[row][col] = " ";
                    harmedVeg++;
                }
            }
            col += 2;
        }
        return harmedVeg;
    }


    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isOutOfBound(String[][] matrix, int row, int col) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }


}

