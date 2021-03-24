package SoftUniJavaProblemSolutions.Fundamentals.Exercise05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E0505BombNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = getNumbersList(scanner);

        String input = scanner.nextLine();
        String[] command = input.split("\\s+");

        int bombNumber = Integer.parseInt(command[0]);
        int powerBombNumber = Integer.parseInt(command[1]);

        for (int i = 0; i < numbersList.size(); i++) {

            if (bombNumber == numbersList.get(i)) {

                if (i - powerBombNumber >= 0 && i + powerBombNumber <= numbersList.size()) {

                    for (int j = i - powerBombNumber; j <= i + powerBombNumber; j++) {

                        numbersList.remove(numbersList.get(i - powerBombNumber));
                    }
                }
                    else if (i + powerBombNumber > numbersList.size()) {
                        for (int j = i - powerBombNumber; j > 0; j--) {
                            numbersList.remove(numbersList.get(i - powerBombNumber));
                        }
                        for (int j = 0; j <= i - powerBombNumber; j++) {
                            numbersList.remove(numbersList.size() - 1);
                        }
                    } else if (i - powerBombNumber < 0) {
                    for (int j = powerBombNumber - i; j > 0; j--) {
                        numbersList.remove(numbersList.get(powerBombNumber - i));
                    }
                    for (int j = 0; j < i - powerBombNumber; j++) {
                        numbersList.remove(numbersList.size() - i);
                    }
                }
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


