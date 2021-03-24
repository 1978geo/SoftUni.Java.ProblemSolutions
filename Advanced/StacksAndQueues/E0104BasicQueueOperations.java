package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class E0104BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] operationsInfo = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        ArrayDeque<Integer> numberQueue = new ArrayDeque<>();

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int numbersNToAdd = operationsInfo[0];
        int numbersSToPoll = operationsInfo[1];
        int numbersXToPeak = operationsInfo[2];

        for (int i = 0; i < numbersNToAdd; i++) {
            numberQueue.offer(numbers.get(i));
        }
        for (int i = 0; i < numbersSToPoll; i++) {
            if (!numberQueue.isEmpty()) {
                numberQueue.poll();
            }
        }
        if (!numberQueue.isEmpty()) {
            if (numberQueue.contains(numbersXToPeak)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(numberQueue));
            }
        } else {
            System.out.println("0");
        }
    }
}
