package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.Scanner;

public class ExamPrep02Snake {

    static int startRow = 0;
    static int startCol = 0;
    static int foodEaten = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();
            if (line.contains("S")) {
                startRow = row;
                startCol = line.indexOf("S");
            }
        }

        boolean isWithinMatrix = true;

        while (foodEaten < 10 && isWithinMatrix) {

            String command = scanner.nextLine();

            if (command.equals("up")) {
                isWithinMatrix = move(startRow - 1, startCol, matrix);
            } else if (command.equals("down")) {
                isWithinMatrix = move(startRow + 1, startCol, matrix);
            } else  if (command.equals("left")) {
                isWithinMatrix = move(startRow,startCol - 1, matrix);
            } else if (command.equals("right")) {
                isWithinMatrix = move(startRow, startCol + 1, matrix);
            }

        }

        String message = !isWithinMatrix
                ? "Game over!"
                : "You won! You fed the snake.";

        System.out.println(message);
        System.out.println("Food eaten: " + foodEaten);

        System.out.println(printMatrix(matrix));
    }

    private static boolean move(int newRow, int newCol, char[][] matrix) {
        matrix[startRow][startCol] = '.';

        if (isOutOfBounds(newRow, newCol, matrix)) {
            return false;
        }

        char symbol = matrix[newRow][newCol];

        if (symbol=='*') {
            foodEaten ++;
        } else if (symbol == 'B') {
            matrix[newRow][newCol] = '.';
            int[] secondBurrowLocation = findSecondBurrow(matrix);
            newRow = secondBurrowLocation[0];
            newCol = secondBurrowLocation[1];
        }

        matrix[newRow][newCol] = 'S';


        startRow = newRow;
        startCol = newCol;
        return true;
    }
    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row >= matrix.length || row < 0
                || col >= matrix[row].length || col < 0;
    }



    public static int[] findSecondBurrow(char[][] matrix) {
        int[] indexes = null;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                if (matrix[r][c] == 'B') {
                    indexes = new int[]{r, c};
                    break;
                }
            }
            if (indexes != null) {
                break;
            }
        }

        return indexes;
    }

    private static String printMatrix(char[][] matrix) {
        StringBuilder out = new StringBuilder();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length ; c++) {
                out.append(matrix[r][c]);
            }
            out.append(System.lineSeparator());
        }
        return out.toString();
    }

}
