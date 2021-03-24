package SoftUniJavaProblemSolutions.Fundamentals.Exercise03_Arrays;

import java.util.Scanner;

public class E0305TopIntegers {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split(" ");

        int[] numbers = new int[line.length];

        for (int i = 0; i < line.length; i++) {

            numbers[i] = Integer.parseInt(line[i]);

            int currentNumber = numbers[i];
            boolean topInteger = true;
            for (int j = i + 1; j < line.length; j++) {
                numbers[j] = Integer.parseInt(line[j]);
                if (currentNumber <= numbers[j]) {
                    topInteger = false;
                }
            }
            if (topInteger) {
                System.out.print(currentNumber + " ");
            }

        }

    }

}


