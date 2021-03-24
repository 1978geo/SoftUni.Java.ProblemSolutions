package SoftUniJavaProblemSolutions.Fundamentals.Exercise03_Arrays;

import java.util.Scanner;

public class E0304ArrayRotation2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");

        int rotations = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < rotations; i++) {

            String firstElement = numbers[0];

            for (int j = 0; j < numbers.length - 1; j++) {

                numbers[j] = numbers[j + 1];

            }
            numbers[numbers.length - 1] = firstElement;

        }
        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");

        }
    }
}
