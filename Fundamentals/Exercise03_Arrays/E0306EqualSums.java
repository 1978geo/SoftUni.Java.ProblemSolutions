package SoftUniJavaProblemSolutions.Fundamentals.Exercise03_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class E0306EqualSums {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).
                mapToInt(element -> Integer.parseInt(element)).toArray();


        if (numbers.length == 1) {
            System.out.println("0");
            return;
        }

        boolean elementExists = false;


        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            int rightSum = 0;

            for (int j = i - 1; j >= 0; j--) {

                int newCurrentNumber = numbers[j];
                leftSum += newCurrentNumber;
            }
            for (int j = i + 1; j < numbers.length; j++) {
                int currentNumber = numbers[j];
                rightSum += currentNumber;
            }

            if (leftSum == rightSum) {
                elementExists = true;
                System.out.print(i);
                break;
            }

        }
        if (!elementExists)
            System.out.println("no");
    }
}
