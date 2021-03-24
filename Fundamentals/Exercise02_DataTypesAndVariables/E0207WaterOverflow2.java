package SoftUniJavaProblemSolutions.Fundamentals.Exercise02_DataTypesAndVariables;

import java.util.Scanner;

public class E0207WaterOverflow2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= numberOfLines; i++) {

            int quantityOfWater = Integer.parseInt(scanner.nextLine());

            if ((quantityOfWater + sum) > 255) {

                System.out.println("Insufficient capacity!");

            } else {
                sum += quantityOfWater;
            }
        }
        System.out.printf("%d", sum);
    }
}
