package SoftUniJavaProblemSolutions.Fundamentals.Lab03_Arrays;

import java.util.Scanner;

public class L0304ReverseArrayOfStrings2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String value = scanner.nextLine();

        String[] items = value.split(" ");

        for (int i = 0; i < items.length; i++) {

            String input = items[i];
        }

        for (int i = 0; i < items.length; i++) {

            String reverseInput = items[items.length - 1 - i];

            System.out.print(reverseInput + " ");
        }

    }
}
