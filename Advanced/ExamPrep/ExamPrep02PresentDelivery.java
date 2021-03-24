package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.Scanner;

public class ExamPrep02PresentDelivery {

    static int startRow = 0;
    static int startCol = 0;
    static int givenPresents = 0;
    static int naughtyGivenPresents = 0;
    static int initialNumberofPresents = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfPresents = Integer.parseInt(scanner.nextLine());
        initialNumberofPresents = numberOfPresents;
        int n = Integer.parseInt(scanner.nextLine());
        int kidsCount = 0;
        char[][] matrix = new char[n][n];

        for (int row = 0; row < n; row++) {
            String line = scanner.nextLine().replaceAll(" ", "");
            matrix[row] = line.toCharArray();
            if (line.contains("S")) {
                startRow = row;
                startCol = line.indexOf("S");
            } else if(line.contains("V")){
                kidsCount++;
            }
        }
        boolean isWithinBakery = true;

        String command = scanner.nextLine();

        while (initialNumberofPresents-givenPresents-naughtyGivenPresents >0 && isWithinBakery &&
                !command.equals("Christmas morning"))  {


            if (command.equals("up")) {
                isWithinBakery = move(startRow - 1, startCol, matrix);
            } else if (command.equals("down")) {
                isWithinBakery = move(startRow + 1, startCol, matrix);
            } else  if (command.equals("left")) {
                isWithinBakery = move(startRow,startCol - 1, matrix);
            } else if (command.equals("right")) {
                isWithinBakery = move(startRow, startCol + 1, matrix);
            }

            if(!hasPresents()){
                String message ="Santa ran out of presents.";
                System.out.println(message);
                break;
            }

//            if(givenPresents+naughtyGivenPresents>=numberOfPresents){
//                String message ="Santa ran out of presents.";
//                System.out.println(message);
//                break;
//            }
            command = scanner.nextLine();
        }

         if(!isWithinBakery){
            String message ="Santa ran out of presents.";
             System.out.println(message);
        }
          System.out.print(printMatrix(matrix));
            if(kidsCount+naughtyGivenPresents<=givenPresents){
                System.out.printf("Good job, Santa! %d happy nice kid/s.", givenPresents);
            } else{
                System.out.printf("No presents for %d nice kid/s.", kidsCount-givenPresents+naughtyGivenPresents);
            }

    }

    private static boolean move(int newRow, int newCol, char[][] matrix) {
        matrix[startRow][startCol] = '-';

        if (isOutOfBounds(newRow, newCol, matrix)) {
            return false;
        }

        char symbol = matrix[newRow][newCol];

        if (symbol=='V') {
            givenPresents ++;
        } else if (symbol == 'C') {

            matrix[newRow][newCol] = '-';


            if((matrix[newRow-1][newCol]=='V')) {
                givenPresents++;
                matrix[newRow-1][newCol]='-';
            } else if(matrix[newRow-1][newCol]=='X'){
                naughtyGivenPresents++;
                matrix[newRow-1][newCol]='-';
            }
            if ((matrix[newRow][newCol-1]=='V')){
                givenPresents++;
                matrix[newRow][newCol-1] = '-';
            } else if (matrix[newRow][newCol-1]=='X'){
                naughtyGivenPresents++;
                matrix[newRow][newCol-1] = '-';
            } if ((matrix[newRow][newCol+1]=='V')) {
                matrix[newRow][newCol+1]='-';
                givenPresents++;
            } else if(matrix[newRow][newCol+1]=='X'){
                naughtyGivenPresents++;
                matrix[newRow][newCol+1]='-';
            }
            if ((matrix[newRow+1][newCol]=='V')){
                matrix[newRow+1][newCol]='-';
                givenPresents++;
            } else if (matrix[newRow+1][newCol]=='X'){
                naughtyGivenPresents++;
                matrix[newRow+1][newCol]='-';
            }

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
    public static boolean hasPresents(){
        if(initialNumberofPresents-givenPresents-naughtyGivenPresents==0){
            return false;
        }
        return true;
    }
}
