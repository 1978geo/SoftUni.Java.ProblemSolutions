package SoftUniJavaProblemSolutions.Fundamentals.Exercise03_Arrays;

import java.util.Scanner;

public class E0303ZigZagArrays {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {

            String value = scanner.nextLine();
            String [] arrayOfValues = value.split(" ");
            int [] arrOne = new int [arrayOfValues.length];
            int [] arrTwo = new int [arrayOfValues.length];

            int firstPrinted = Integer.parseInt(arrayOfValues[0]);
            int secondPrinted = Integer.parseInt(arrayOfValues[1]);


            if (i % 2 == 0) {
                System.out.print(firstPrinted + " ");
                            }
            else {
                System.out.print(secondPrinted + " ");

            }

        }

        for (int i = 0; i < n; i++) {

            String value = scanner.nextLine();
            String [] arrayOfValues = value.split(" ");
            int [] arrOne = new int [arrayOfValues.length];


            int firstPrinted = Integer.parseInt(arrayOfValues[0]);
            int secondPrinted = Integer.parseInt(arrayOfValues[1]);


            if (i % 2 == 0) {

                System.out.print(secondPrinted + " ");
            }
            else {
               System.out.print(firstPrinted + " ");
            }

        }
    }
}
