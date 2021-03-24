package SoftUniJavaProblemSolutions.Fundamentals.Exercise02_DataTypesAndVariables;

import java.util.Scanner;

public class E0211Snowballs {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int numberOfSnowballs = Integer.parseInt(scanner.nextLine());
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i < numberOfSnowballs; i++) {

            int snowBallSnow = Integer.parseInt(scanner.nextLine());
            int snowBallTime = Integer.parseInt(scanner.nextLine());
            int snowBallQuality = Integer.parseInt(scanner.nextLine());

            double snowBallValue = Math.pow((snowBallSnow * 1.0 / snowBallTime), snowBallQuality);

            if (snowBallValue > maxValue) {
                maxValue = snowBallValue;

                System.out.printf("%d : %d = %.0f (%d)", snowBallSnow, snowBallTime, maxValue, snowBallQuality);
            }

        }
    }
}
