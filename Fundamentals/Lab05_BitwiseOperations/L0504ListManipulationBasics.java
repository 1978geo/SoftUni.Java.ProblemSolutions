package SoftUniJavaProblemSolutions.Fundamentals.Lab05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L0504ListManipulationBasics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = getNumbersList(scanner);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                int addNumber = Integer.parseInt(command[1]);
                numbersList.add(addNumber);

            }
            if (command[0].equals("Remove")) {
                int removeNumber = Integer.parseInt(command[1]);
                numbersList.remove(removeNumber);

            }
            if (command[0].equals("RemoveAt")) {
                int removeAtNumber = Integer.parseInt(command[1]);
                numbersList.remove(removeAtNumber);

            }
            if (command[0].equals("Insert")) {
                int insertNumber = Integer.parseInt(command[1]);
                int insertAtIndex = Integer.parseInt(command[2]);
                numbersList.add(insertAtIndex, insertNumber);

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
