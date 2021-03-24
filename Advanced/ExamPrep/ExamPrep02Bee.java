package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.Scanner;

public class ExamPrep02Bee {
    static int startRow = 0;
    static int newRow = 0;
    static int startCol = 0;
    static int newCol = 0;
    static int pollinatedFlowers = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine();
            matrix[row] = line.toCharArray();
            if (line.contains("B")) {
                startRow = row;
                startCol = line.indexOf("B");
            }
        }

        String command = scanner.nextLine();

        boolean isWithinTheTerritory = true;

        while (!command.equals("End") && isWithinTheTerritory) {

            if (command.equals("up")) {
                isWithinTheTerritory = move(startRow - 1, startCol, matrix);
            } else if (command.equals("down")) {
                isWithinTheTerritory = move(startRow + 1, startCol, matrix);
            } else  if (command.equals("left")) {
                isWithinTheTerritory = move(startRow,startCol - 1, matrix);
            } else if (command.equals("right")) {
                isWithinTheTerritory = move(startRow, startCol + 1, matrix);
            }

            if(!isWithinTheTerritory) {
                System.out.println("The bee got lost!");
                break;
            }

            command = scanner.nextLine();
        }

        if(pollinatedFlowers>=5){
            System.out.printf("Great job, the bee manage to pollinate %d flowers!%n", pollinatedFlowers);
        }else{
            System.out.printf("The bee couldn't pollinate the flowers, she needed %d flowers more%n" , 5-pollinatedFlowers);
        }
        System.out.println(printMatrix(matrix));
    }
    private static boolean move(int newRow, int newCol, char[][] matrix) {

        matrix[startRow][startCol] = '.';

        if (isOutOfBounds(newRow, newCol, matrix)) {

            return false;
        }
        char symbol = matrix[newRow][newCol];

        if (symbol=='f') {
            pollinatedFlowers ++;
        } else if (symbol == 'O') {
            int rowDifference = newRow-startRow;
            int colDifference = newCol-startCol;
            matrix[newRow][newCol] = '.';
            newRow = newRow+rowDifference;
            newCol = newCol+colDifference;
            symbol = matrix[newRow][newCol];
            if (symbol=='f') {
                pollinatedFlowers++;
            }

        }

        matrix[newRow][newCol] = 'B';

        startRow = newRow;
        startCol = newCol;
        return true;
    }

    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        if( row >= matrix.length || row < 0
                || col >= matrix[row].length || col < 0 ){
            return true;
        }
        return false;

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
