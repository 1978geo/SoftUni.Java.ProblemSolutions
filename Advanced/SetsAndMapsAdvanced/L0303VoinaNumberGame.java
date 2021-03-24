package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L0303VoinaNumberGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        LinkedHashSet<Integer> secondPlayerCards = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(LinkedHashSet::new));

        int n = 0;

        while (n < 50 && !firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            n++;
            int firstNumber = firstPlayerCards.iterator().next();
            firstPlayerCards.remove(firstNumber);

            int secondNumber = secondPlayerCards.iterator().next();
            secondPlayerCards.remove(secondNumber);

            if (firstNumber > secondNumber) {
                firstPlayerCards.add(firstNumber);
                firstPlayerCards.add(secondNumber);
            } else if (firstNumber < secondNumber) {
                secondPlayerCards.add(firstNumber);
                secondPlayerCards.add(secondNumber);
            }
        }
        if (firstPlayerCards.isEmpty()) {
            System.out.println("Second player win!");
            return;
        }
        if (secondPlayerCards.isEmpty()) {
            System.out.println("First player win!");
            return;
        }
        if (firstPlayerCards.size() > secondPlayerCards.size()) {
            System.out.println("First player win!");
            return;
        }
        if (firstPlayerCards.size() < secondPlayerCards.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw");
        }
    }
}
