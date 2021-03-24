package SoftUniJavaProblemSolutions.Fundamentals.Lab05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L0507RemoveNegativesAndReverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = getNumbersListOne(scanner);

        for (int i = 0; i < listNumbers.size(); i++) {

            int number = listNumbers.get(i);
            if (number < 0) {
                listNumbers.remove(i);
                i -= 1;
            }
        }
        if (listNumbers.isEmpty()) {
            System.out.println("empty");
        } else {
            for (int i = listNumbers.size() - 1; i >= 0; i--) {
                int number = listNumbers.get(i);
                System.out.print(number + " ");
            }
        }
    }

    public static List<Integer> getNumbersListOne(Scanner scanner) {
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