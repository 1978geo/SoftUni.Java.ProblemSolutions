package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.Scanner;

public class Exam02ProblemOK {
    static int startRow = 0;
    static int startCol = 0;
    static int deactivatedBombs = 0;
    static int initialBombs = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String [] commandArray = scanner.nextLine().split(",");

        char[][] matrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine().replaceAll(" ","");
            matrix[row] = line.toCharArray();
            if (line.contains("s")) {
                startRow = row;
                startCol = line.indexOf("s");
            }

            for (int i = 0; i < line.length(); i++) {
                if(matrix[row][i] == 'B') {
                    initialBombs++;
                }
            }
        }

        boolean isWithinBakery = true;

        for (int i = 0; i < commandArray.length; i++) {
            String command = commandArray[i];

            if (command.equals("up")) {
                isWithinBakery = move(startRow - 1, startCol, matrix);
            } else if (command.equals("down")) {
                isWithinBakery = move(startRow + 1, startCol, matrix);
            } else  if (command.equals("left")) {
                isWithinBakery = move(startRow,startCol - 1, matrix);
            } else if (command.equals("right")) {
                isWithinBakery = move(startRow, startCol + 1, matrix);
            }

            if(matrix[startRow][startCol] == 'e'){
                System.out.printf("END! %d bombs left on the field", initialBombs-deactivatedBombs);
                return;
            }

        }

        if(initialBombs==deactivatedBombs) {
            System.out.println("Congratulations! You found all bombs!");

        } else{
            System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)",initialBombs-deactivatedBombs,startRow,startCol);
        }

    }

    private static boolean move(int newRow, int newCol, char[][] matrix) {
        matrix[startRow][startCol] = '+';

        if (isOutOfBounds(newRow, newCol, matrix)) {
            newRow = startRow;
            newCol = startCol;
            matrix[startRow][startCol] = 's';
            return false;
        }

        char symbol = matrix[newRow][newCol];

        if (symbol=='B') {
            System.out.println("You found a bomb!");
            deactivatedBombs++;

        } else if (symbol == 'e') {
            startRow = newRow;
            startCol = newCol;
            matrix[newRow][newCol] = 'e';
            return false;

        }

        matrix[newRow][newCol] = '+';

        startRow = newRow;
        startCol = newCol;
        return true;
    }

    private static boolean isOutOfBounds(int row, int col, char[][] matrix) {
        return row >= matrix.length || row < 0
                || col >= matrix[row].length || col < 0;
    }

}

