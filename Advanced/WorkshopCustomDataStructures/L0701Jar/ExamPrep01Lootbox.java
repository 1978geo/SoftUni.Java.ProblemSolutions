package SoftUniJavaProblemSolutions.Advanced.WorkshopCustomDataStructures.L0701Jar;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamPrep01Lootbox {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Queue
        ArrayDeque<Integer> boxOne = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new)); // add()

        // Stack
        ArrayDeque<Integer> boxTwo = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(boxTwo::push);

        int collectedValues = 0;

        while (!boxOne.isEmpty() && !boxTwo.isEmpty()) {

            int currentBoxOne = boxOne.peek();
            int currentBoxTwo = boxTwo.pop();

            int currentSum = currentBoxOne + currentBoxTwo;

            if (currentSum % 2 == 0) {
                collectedValues += currentSum;
                boxOne.poll();
            } else {
                boxOne.offer(currentBoxTwo);
            }
        }
        if (boxOne.isEmpty()) {
            System.out.println("First lootbox is empty");
        } else {
            System.out.println("Second lootbox is empty");
        }

        if (collectedValues >= 100) {
            System.out.printf("Your loot was epic! Value: %d", collectedValues);
        } else {
            System.out.printf("Your loot was poor... Value: %d", collectedValues);
        }
    }
}
