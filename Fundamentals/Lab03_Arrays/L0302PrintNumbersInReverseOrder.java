package SoftUniJavaProblemSolutions.Fundamentals.Lab03_Arrays;

import java.util.Scanner;

public class L0302PrintNumbersInReverseOrder {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            numbers[i] = number;
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");

        }
    }

}
