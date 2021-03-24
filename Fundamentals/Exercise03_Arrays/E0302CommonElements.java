package SoftUniJavaProblemSolutions.Fundamentals.Exercise03_Arrays;

import java.util.Scanner;

public class E0302CommonElements {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] lineOne = scanner.nextLine().split(" ");
        String[] lineTwo = scanner.nextLine().split(" ");
        int[] arr = new int[lineOne.length];

        for (int i = 0; i < lineTwo.length; i++) {

            String elementTwo = lineTwo[i];

            for (int j = 0; j < lineOne.length; j++) {

                String elementOne = lineOne[j];

                if (lineTwo[i].equals(elementOne)) {
                    System.out.print(elementOne + " ");
                }
            }

        }

    }
}
