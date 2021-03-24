package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.Scanner;

public class ExamPrep02ReVolt {

    static int startRow;
    static int finishRow;
    static int startCol;
    static int finishCol;
    static char[][] matrix = null;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        matrix = new char[n][n];

        int numberCommands = Integer.parseInt(scanner.nextLine());

        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();
            if (line.contains("f")) {
                startRow = row;
                startCol = line.indexOf("f");
            } else if (line.contains("F")) {
                finishRow = row;
                finishCol = line.indexOf("F");
            }
        }
        boolean hasWon = false;
        for (int i = 0; i < numberCommands; i++) {
            String command = scanner.nextLine();

            if (command.equals("up")) {

                move(startRow - 1, startCol, matrix);
            } else if (command.equals("down")) {

                move(startRow + 1, startCol, matrix);
            } else if (command.equals("left")) {

                move(startRow, startCol - 1, matrix);
            } else if (command.equals("right")) {

                move(startRow, startCol + 1, matrix);
            }
            if (hasWon = startRow == finishRow && startCol == finishCol) {
                matrix[startRow][startCol] = 'f';
                break;
            }
        }

        if (hasWon) {
            System.out.println("Player won!");
        } else {
            System.out.println("Player lost!");
        }

        System.out.print(printMatrix(matrix));
    }

    private static String printMatrix(char[][] matrix) {
        StringBuilder out = new StringBuilder();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++) {
                out.append(matrix[r][c]);
            }
            out.append(System.lineSeparator());
        }
        return out.toString();
    }

    private static boolean move(int newRow, int newCol, char[][] matrix) {
        matrix[startRow][startCol] = '-';

        if(startRow-1<0){
            newRow=matrix.length-1;
        }
        else if(startRow+1>matrix.length){
            newRow=0;
        }
        else if(startCol-1<0){
            newCol=matrix.length-1;
        }
        else if(startCol+1>matrix.length){
            newCol=0;
        }

        char symbol = matrix[newRow][newCol];

        if (symbol == 'T') {
            int rowDifferance = newRow - startRow;
            int colDifferance = newCol - startCol;
            newRow = newRow - rowDifferance;
            newCol = newCol - colDifferance;
            matrix[newRow][newCol] = 'f';

        } else if (symbol == 'B') {
            int rowDifferance = newRow - startRow;
            int colDifferance = newCol - startCol;
            newRow = newRow + rowDifferance;
            newCol = newCol + colDifferance;
            matrix[newRow][newCol] = 'f';
        }
        startRow = newRow;
        startCol = newCol;
        matrix[startRow][startCol] = 'f';
        return true;
    }

}

