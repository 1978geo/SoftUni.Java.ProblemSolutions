package SoftUniJavaProblemSolutions.Fundamentals.Exercise02_DataTypesAndVariables;

import java.util.Scanner;

public class E0207WaterOverflow {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        boolean enoughCapacity = true;

        for (int i = 1; i <= numberOfLines; i++) {

            int quantityOfWater = Integer.parseInt(scanner.nextLine());

            sum += quantityOfWater;

            if ((sum) > 255) {
                enoughCapacity = false;
                System.out.println("Insufficient capacity!");
                sum = sum - quantityOfWater;
            } else if (quantityOfWater > 255) {
                enoughCapacity = false;
                System.out.println("Insufficient capacity!");
                System.out.printf("%d", (sum - quantityOfWater));
            }
        }

        if (sum <= 255) {
            System.out.printf("%d", sum);
        }

    }
}
