package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.Scanner;

public class ExamPrep02BookWorm {

    static int startRow = 0;
    static int startCol = 0;
    static StringBuilder out = new StringBuilder();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        out.append(input);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();
            if (line.contains("P")) {
                startRow = row;
                startCol = line.indexOf("P");
            }
        }
        String command = scanner.nextLine();

        while (!command.equals("end")){

            if (command.equals("up")) {
                move(startRow - 1, startCol, matrix);
            } else if (command.equals("down")) {
                move(startRow + 1, startCol, matrix);
            } else  if (command.equals("left")) {
                move(startRow,startCol - 1, matrix);
            } else if (command.equals("right")) {
                move(startRow, startCol + 1, matrix);
            }

            command=scanner.nextLine();
        }
        System.out.println(out.toString());
        System.out.println(printMatrix(matrix));
    }
    private static boolean move(int newRow, int newCol, char[][] matrix) {
        matrix[startRow][startCol] = '-';

        if (isOutOfBounds(newRow, newCol, matrix)) {

            newRow = startRow;
            newCol = startCol;
            matrix[startRow][startCol] = 'P';
            out.deleteCharAt(out.length()-1);
            return false;
        }

        char symbol = matrix[newRow][newCol];

        if (Character.isLetter(symbol)) {
            out.append(symbol);
        }

        matrix[newRow][newCol] = 'P';

        startRow = newRow;
        startCol = newCol;
        return true;
    }
    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row >= matrix.length || row < 0
                || col >= matrix[row].length || col < 0;
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
