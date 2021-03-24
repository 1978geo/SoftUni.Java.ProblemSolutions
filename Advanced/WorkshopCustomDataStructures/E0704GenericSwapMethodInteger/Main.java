package SoftUniJavaProblemSolutions.Advanced.WorkshopCustomDataStructures.E0704GenericSwapMethodInteger;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());;
        Box<Integer> box = new Box<>();
        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            box.addValue(value);
        }
        int[] indexes = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int indexOne = indexes[0];
        int indexTwo = indexes[1];
        box.swap(indexOne, indexTwo);
        System.out.println(box);
    }
}


