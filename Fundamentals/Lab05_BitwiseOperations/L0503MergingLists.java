package SoftUniJavaProblemSolutions.Fundamentals.Lab05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L0503MergingLists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> listOne = getNumbersListOne(scanner);

        List<Integer> listTwo = getNumbersListTwo(scanner);

        List<Integer> newNumbersList = new ArrayList<>();

        if (listOne.size() > listTwo.size()) {

            for (int i = 0; i < listTwo.size(); i++) {
                int listOneNumber = listOne.get(i);
                int listTwoNumber = listTwo.get(i);

                newNumbersList.add(listOneNumber);
                newNumbersList.add(listTwoNumber);
            }
        }
        for (int i = listTwo.size(); i < listOne.size(); i++) {
            int listOneNumber = listOne.get(i);

            newNumbersList.add(listOneNumber);
        }
        if (listOne.size() <= listTwo.size()) {

            for (int i = 0; i < listOne.size(); i++) {
                int listOneNumber = listOne.get(i);
                int listTwoNumber = listTwo.get(i);

                newNumbersList.add(listOneNumber);
                newNumbersList.add(listTwoNumber);
            }
        }
        for (int i = listOne.size(); i < listTwo.size(); i++) {
            int listTwoNumber = listTwo.get(i);

            newNumbersList.add(listTwoNumber);
        }

        for (int i = 0; i < newNumbersList.size(); i++) {
            int number = newNumbersList.get(i);
            System.out.printf("%d ", number);
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


    public static List<Integer> getNumbersListTwo(Scanner scanner) {
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
