package SoftUniJavaProblemSolutions.Fundamentals.Exercise05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E0502ChangeList {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = getNumbersList(scanner);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");

            if (command[0].equals("Delete")) {
                int addNumber = Integer.parseInt(command[1]);
                for (int i = numbersList.size()-1; i >= 0; i--) {
                    if (addNumber == numbersList.get(i)) {
                        numbersList.remove(i);
                    }
                }
            }
            if (command[0].equals("Insert")) {
                int elementNumber = Integer.parseInt(command[1]);
                int positionNumber = Integer.parseInt(command[2]);
                if(positionNumber>=0 && positionNumber<numbersList.size()){
                    numbersList.add(positionNumber, elementNumber);
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
        String[] numberAsString = line.split("\\s+");
        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < numberAsString.length; i++) {
            int number = Integer.parseInt(numberAsString[i]);
            numbersList.add(number);
        }
        return numbersList;
    }
}
