package SoftUniJavaProblemSolutions.Fundamentals.Exercise03_Arrays;

import java.util.Scanner;

public class E0303ZigZagArrays2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] arrOne = new int[n];
        int[] arrTwo = new int[n];

        for (int i = 1; i <= n; i++) {

            String[] value = scanner.nextLine().split(" ");

            if (i % 2 == 0) {

                arrOne[i - 1] = Integer.parseInt(value[1]);
                arrTwo[i - 1] = Integer.parseInt(value[0]);
            } else {

                arrOne[i - 1] = Integer.parseInt(value[0]);
                arrTwo[i - 1] = Integer.parseInt(value[1]);
            }

        }
        for (int i = 0; i < n; i++) {

            System.out.print(arrOne[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < n; i++) {

            System.out.print(arrTwo[i] + " ");

        }
    }
}


