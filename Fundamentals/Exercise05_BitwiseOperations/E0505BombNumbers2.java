package SoftUniJavaProblemSolutions.Fundamentals.Exercise05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E0505BombNumbers2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = getNumbersList(scanner);

        String input = scanner.nextLine();
        String[] command = input.split("\\s+");

        int bombNumber = Integer.parseInt(command[0]);
        int powerBombNumber = Integer.parseInt(command[1]);

        while (numbersList.contains(bombNumber)){

            int bombPosition = numbersList.indexOf(bombNumber);

            int leftBound = Math.max(0,bombPosition-powerBombNumber);
            int rightBound = Math.min(numbersList.size(), bombPosition+powerBombNumber);


            for (int i = rightBound; i >=leftBound ; i--) {

                numbersList.remove(i);
            }
        }
        int sum = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            int number = numbersList.get(i);
            sum += number;
        }

        System.out.printf("%d ", sum);

    }
    public static List<Integer> getNumbersList(Scanner scanner) {
        String line = scanner.nextLine();
        String[] numberAsString = line.split("\\s+");
        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < numberAsString.length; i++) {
            int number = Integer.parseInt(numberAsString[i]);
            numbersList.add(number);
        }
        return numbersList;
    }
}
