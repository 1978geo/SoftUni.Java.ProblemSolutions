package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExamPrep02ReVolt2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String[][] matrix = new String[N][N];
        int n = Integer.parseInt(bf.readLine());
        int startRow = 0;
        int startCol = 0;

        boolean hasWon = false;

        for (int i = 0; i < matrix.length ; i++) {
            String[] rows = bf.readLine().split("");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rows[j];

                if (matrix[i][j].equals("f")){
                    startRow = i;
                    startCol = j;
                }
            }
        }
        matrix[startRow][startCol] = "-";
        String command = bf.readLine();

        for (int i = 0; i < n ; i++) {
            int previousRow = startRow;
            int previousCol = startCol;
            String field;


            switch (command) {
                case "up":
                    startRow--;
                    if (startRow < 0){
                        startRow = matrix.length-1;
                    }

                    break;
                case "down":
                    startRow++;
                    if (startRow > matrix.length-1){
                        startRow = 0;
                    }
                    break;

                case "left":
                    startCol--;
                    if (startCol < 0){
                        startCol = matrix.length -1;
                    }
                    break;


                case "right":
                    startCol++;
                    if (startCol > matrix.length-1){
                        startCol = 0;
                    }
                    break;
            }

            field = matrix[startRow][startCol];

            if (field.equals("F")){
                System.out.println("Player won!");
                hasWon = true;
                break;
            }
            else if (field.equals("B")){
                i--;
                continue;
            }
            else if (field.equals("T")){
                startCol = previousCol;
                startRow = previousRow;
                field = matrix[startRow][startCol];
            }
            command = bf.readLine();
        }

        if (!hasWon) {
            System.out.println("Player lost!");

        }
        matrix[startRow][startCol] = "f";
        for (int row = 0; row < matrix.length ; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }

    }

}
