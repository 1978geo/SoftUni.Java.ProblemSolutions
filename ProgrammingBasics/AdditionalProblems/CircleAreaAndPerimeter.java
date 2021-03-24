package SoftUniJavaProblemSolutions.ProgrammingBasics.AdditionalProblems;

import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = Double.parseDouble(scanner.nextLine());

        double circleArea = Math.PI*radius*radius;
        double circlePerimeter = 2*Math.PI*radius;

        System.out.printf("calculated area " + "%.2f%n", circleArea);
        System.out.printf("calculated parameter " + "%.2f", circlePerimeter);

    }
}
