package SoftUniJavaProblemSolutions.Fundamentals.Lab05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L0502GaussTrick {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = getNumbersList(scanner);

        List<Integer> newNumbersList = new ArrayList<>();


        if  (numbersList.size() % 2 == 0) {
            for (int i = 0; i < numbersList.size() / 2; i++) {
                int number = (numbersList.get(i)) + (numbersList.get(numbersList.size() - i - 1));
                newNumbersList.add(number);
            }
        }
        else  {
            for (int i = 0; i <= numbersList.size() / 2; i++) {
                int number = (numbersList.get(i)) + (numbersList.get(numbersList.size() - i - 1));
                newNumbersList.add(number);
            }
            int middleNumber = numbersList.get(numbersList.size()/2);

            newNumbersList.set((numbersList.size()/ 2), middleNumber);
        }
        for (int i = 0; i < newNumbersList.size() ; i++) {
            int number = newNumbersList.get(i);
            System.out.printf("%d ", number );
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
