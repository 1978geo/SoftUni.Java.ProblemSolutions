package SoftUniJavaProblemSolutions.Fundamentals.Lab03_Arrays;

import java.util.Scanner;

public class L0303SumEvenNumbers {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String values = scanner.nextLine();
        String[] items = values.split(" ");
        int[] arr = new int[items.length];

        int sum = 0;
        for (int i = 0; i < items.length; i++) {
            int number = Integer.parseInt(items[i]);

            if (number % 2 == 0) {
                sum += number;
            }

        }
        System.out.print(sum);

    }
}