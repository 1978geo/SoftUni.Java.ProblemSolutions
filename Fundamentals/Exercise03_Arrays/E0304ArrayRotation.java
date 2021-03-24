package SoftUniJavaProblemSolutions.Fundamentals.Exercise03_Arrays;

import java.util.Scanner;

public class E0304ArrayRotation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] value = scanner.nextLine().split(" ");

        int[] arrayNumbers = new int[value.length];
        int[] newOrderNumbers = new int[value.length];

        int n = Integer.parseInt(scanner.nextLine());

        if (n > value.length) {

            for (int i = 1; i <= n; i++) {

                if (((i + n) >= value.length)) {

                    if (((i - 1) + n) - value.length >= value.length) {

                        newOrderNumbers[i - 1] = Integer.parseInt(value[i % value.length]);

                        System.out.print(newOrderNumbers[i - 1] + " ");

                    }

                    newOrderNumbers[i] = Integer.parseInt(value[((i - 1) + n) - value.length]);

                    System.out.print(newOrderNumbers[i] + " ");
                    continue;
                }

                newOrderNumbers[i - 1] = Integer.parseInt(value[((i - 1) + n)]);

                System.out.print(newOrderNumbers[i - 1] + " ");
            }

        } else {

            for (int i = 1; i <= value.length; i++) {

                if ((i - 1 + n >= value.length)) {
                    newOrderNumbers[i - 1] = Integer.parseInt(value[((i - 1) + n) - value.length]);

                    System.out.print(newOrderNumbers[i - 1] + " ");
                    continue;
                }

                newOrderNumbers[i - 1] = Integer.parseInt(value[(i - 1) + n]);

                System.out.print(newOrderNumbers[i - 1] + " ");
            }

        }
    }
}
