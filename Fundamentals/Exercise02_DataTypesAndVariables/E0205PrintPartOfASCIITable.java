package SoftUniJavaProblemSolutions.Fundamentals.Exercise02_DataTypesAndVariables;

import java.util.Scanner;

public class E0205PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCharStart = Integer.parseInt(scanner.nextLine());

        int inputCharFinish = Integer.parseInt(scanner.nextLine());


        for (int i = (int) inputCharStart; i <= (int) inputCharFinish; i++) {

            System.out.printf("%c ", (char) i);
        }

    }
}
