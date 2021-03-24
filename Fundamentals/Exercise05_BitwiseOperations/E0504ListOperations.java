package SoftUniJavaProblemSolutions.Fundamentals.Exercise05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E0504ListOperations {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = getNumbersList(scanner);

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] command = input.split("\\s+");

            if (command[0].equals("Add")) {
                int addNumber = Integer.parseInt(command[1]);
                numbersList.add(addNumber);
            }
            if (command[0].equals("Insert")) {
                int addNumber = Integer.parseInt(command[1]);
                int addIndex = Integer.parseInt(command[2]);
                if (addIndex >= 0 && addIndex < numbersList.size()) {
                    numbersList.add(addIndex, addNumber);
                } else {
                    System.out.println("Invalid index");
                }
            }
            if (command[0].equals("Remove")) {
                int removeNumber = Integer.parseInt(command[1]);
                if (removeNumber >= 0 && removeNumber < numbersList.size()) {
                    numbersList.remove(removeNumber);
                } else {
                    System.out.println("Invalid index");
                }

            }
            if (command[1].equals("left")) {
                int countTimes = Integer.parseInt(command[2]);

                for (int i = 0; i < countTimes; i++) {
                    int first = numbersList.get(0);
                    numbersList.remove(0);
                    numbersList.add(first);
                }
            }
            if (command[1].equals("right")) {
                int countTimes = Integer.parseInt(command[2]);

                for (int i = 0; i < countTimes; i++) {
                    int last = numbersList.get(numbersList.size() - 1);
                    numbersList.remove(numbersList.size() - 1);
                    numbersList.add(0, last);
                }
            }
            input = scanner.nextLine();
        }

        for (int i = 0; i < numbersList.size(); i++) {
            int number = numbersList.get(i);
            System.out.printf("%d ", number);
        }

    }

    public static List<Integer> getNumbersList(Scanner scanner) {
        String line = scanner.nextLine();
        String[] numberAsString = line.split(" ");
        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < numberAsString.length; i++) {
            int number = Integer.parseInt(numberAsString[i]);
            numbersList.add(number);
        }
        return numbersList;
    }
}
