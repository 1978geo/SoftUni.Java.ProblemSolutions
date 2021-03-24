package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.*;
import java.util.stream.Collectors;

public class E0102BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] operationsInfo = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> finalNumbers = new ArrayList<>();

        ArrayDeque<Integer> numberStack = new ArrayDeque<>();

        int numbersNToPush = operationsInfo[0];
        int numbersSToPop = operationsInfo[1];
        int numbersXToPeak = operationsInfo[2];

        for (int i = 0; i < numbersNToPush; i++) {
            numberStack.push(numbers.get(i));
        }
        for (int i = 0; i < numbersSToPop; i++) {
            numberStack.pop();
        }
        if (numberStack.isEmpty()) {
            System.out.println("0");
        } else {
            if (numberStack.contains(numbersXToPeak)) {
                System.out.println("true");
                return;
            } else {
                while (!numberStack.isEmpty())
                finalNumbers.add(numberStack.pop());
                }
                finalNumbers.sort(null);
                System.out.println(finalNumbers.get(0));
            }
        }
    }

