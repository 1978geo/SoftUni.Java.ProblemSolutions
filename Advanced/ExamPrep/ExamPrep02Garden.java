package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExamPrep02Garden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] tokens = scanner.nextLine().split("\\s+");

        int n = Integer.parseInt(tokens[0]);
        int m = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[n][m];

       fillMatrix(matrix);

        tokens = scanner.nextLine().split("\\s+");

        List<Integer> receivedCoordinates = new ArrayList<>();

        while (!tokens[0].equals("Bloom")){

            if(Integer.parseInt(tokens[0])<0 || Integer.parseInt(tokens[0]) > n ||
                    Integer.parseInt(tokens[1])<0 || Integer.parseInt(tokens[1]) > n){
                System.out.println("Invalid coordinates.");
                tokens = scanner.nextLine().split("\\s+");
                continue;
            }
            receivedCoordinates.add(Integer.parseInt(tokens[0]));
            receivedCoordinates.add(Integer.parseInt(tokens[1]));

            tokens = scanner.nextLine().split("\\s+");
        }

        for (int i = 0; i < receivedCoordinates.size(); i+=2) {

            for (int j = 0; j < n; j++) {
                matrix[receivedCoordinates.get(i)][j]++;
            }
            for (int k = 0; k < m; k++) {
                matrix[k][receivedCoordinates.get(i+1)]++;
            }
            matrix[receivedCoordinates.get(i)][receivedCoordinates.get(i+1)]--;
        }

        System.out.println(printMatrix(matrix));
    }

    private static String fillMatrix(int[][] matrix) {
        StringBuilder out = new StringBuilder();
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length ; c++) {
                int startValue=0;
                out.append(startValue);
            }
            out.append(System.lineSeparator());
        }
        return out.toString();
    }

    private static String printMatrix(int[][] matrix) {
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
