package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exam01Problem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Queue
        ArrayDeque<Integer> magicOne = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new)); // add()

        // Stack
        ArrayDeque<Integer> magicTwo = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(magicTwo::push);

        int finalSum = 0;
        while (!magicOne.isEmpty() && !magicTwo.isEmpty()) {

            int currentQueueOne = magicOne.peek();
            int currentStackTwo = magicTwo.pop();

            int currentSum = currentQueueOne + currentStackTwo;

            if (currentSum % 2 == 0) {
                finalSum += currentSum;
                magicOne.poll();
            } else {
                magicOne.offer(currentStackTwo);
            }


        }

        if (magicOne.isEmpty()) {
            System.out.println("First magic box is empty.");
        }
        if (magicTwo.isEmpty()) {
            System.out.println("Second magic box is empty.");
        }

        if (finalSum >= 90) {
            System.out.printf("Wow, your prey was epic! Value: %d", finalSum);
        } else {
            System.out.printf("Poor prey... Value: %d", finalSum);
        }

    }
}

