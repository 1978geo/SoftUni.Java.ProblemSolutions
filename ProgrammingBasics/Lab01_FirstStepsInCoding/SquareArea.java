package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab01_FirstStepsInCoding;

import java.util.Scanner;

public class SquareArea {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int sideA = Integer.parseInt(input);

        System.out.println(sideA * sideA);
    }

}
