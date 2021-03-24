package SoftUniJavaProblemSolutions.Fundamentals.Lab03_Arrays;

import java.util.Scanner;

public class L0306EqualArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstValue = scanner.nextLine();
        String[] lineOne = firstValue.split(" ");
        int[] arrOne = new int[lineOne.length];

        String secondValue = scanner.nextLine();
        String[] lineTwo = secondValue.split(" ");
        int[] arrTwo = new int[lineTwo.length];

        int sumOne = 0;

        boolean areIdentical = true;

        for (int i = 0; i < lineOne.length; i++) {
            arrOne[i] = Integer.parseInt(lineOne[i]);
            arrTwo[i] = Integer.parseInt(lineTwo[i]);
            sumOne = arrOne[i];
            if (arrOne[i] != arrTwo[i]) {
                areIdentical = false;
                System.out.printf("Arrays are not identical. Found difference at %d index.", i);
                break;
            } else {
                sumOne += arrOne[i];
            }
        }

        if (areIdentical) {
            System.out.print("Arrays are identical. ");
            System.out.printf("Sum: %d", sumOne);
        }
    }
}
