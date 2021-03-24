package SoftUniJavaProblemSolutions.ProgrammingBasics.Lab01_FirstStepsInCoding;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double inches = Double.parseDouble(input);

        double centimeteres = inches * 2.54;

        System.out.println(centimeteres);


    }

}
