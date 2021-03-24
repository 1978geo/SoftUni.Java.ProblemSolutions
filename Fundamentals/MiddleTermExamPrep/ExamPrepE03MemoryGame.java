package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamPrepE03MemoryGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> items = Arrays.stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        String commands = scanner.nextLine();
        int numberOfMoves = 0;

        while (!commands.equals("end")) {

            if (items.isEmpty()) {
                System.out.printf("You have won in %d turns!", numberOfMoves);
                return;
            }
            numberOfMoves++;

            int[] index = Arrays.stream(commands.split(" ")).
                    mapToInt(element -> Integer.parseInt(element)).toArray();
            int indexZero = index[0];
            int indexOne = index[1];

            if (indexOne == indexZero || indexOne < 0 ||
                    indexOne > items.size() - 1 || indexZero < 0 ||
                    indexZero > items.size() - 1) {
                System.out.println("Invalid input! Adding additional elements to the board");

                String s = "-";
                s = s.concat(Integer.toString(numberOfMoves));
                s = s.concat("a");
                items.add((items.size() / 2), s);
                items.add((items.size() / 2 + 1), s);

            } else if (items.get(indexZero).equals(items.get(indexOne))) {
                String currentItem = items.get(indexOne);
                if (indexZero > indexOne) {
                    items.remove(indexZero);
                    items.remove(indexOne);
                } else {
                    items.remove(indexOne);
                    items.remove(indexZero);
                }

                System.out.printf("Congrats! You have found matching elements - %s!%n", currentItem);
            } else if (!items.get(indexZero).equals(items.get(indexOne))) {
                System.out.println("Try again!");
            }
            commands = scanner.nextLine();
        }
        if (!items.isEmpty()) {
            System.out.println("Sorry you lose :(");
            System.out.print(String.join(" ", items));
        }

    }
}
