package SoftUniJavaProblemSolutions.Fundamentals.Lab03_Arrays;

import java.util.Scanner;

public class L0305EvenAndOddSubtraction {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        String[] items = value.split(" ");

        int[] arr = new int[items.length];

        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 0; i < items.length; i++) {

            int number = Integer.parseInt(items[i]);

            if (number % 2 == 0) {
                evenNumber += number;
            } else {
                oddNumber += number;
            }
        }
        System.out.printf("%d", evenNumber - oddNumber);
    }

}
