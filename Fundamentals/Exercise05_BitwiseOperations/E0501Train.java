package SoftUniJavaProblemSolutions.Fundamentals.Exercise05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E0501Train {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = getNumbersList(scanner);

        int maxWagonCapacity = Integer.parseInt(scanner.nextLine());

        String[] command = scanner.nextLine().split(" ");

        while (!command[0].equals("end")) {

            if (command[0].equals("Add")) {
                int addNumber = Integer.parseInt(command[1]);
                numbersList.add(addNumber);
            } else {
                for (int i = 0; i < numbersList.size(); i++) {
                    int passengersToFit = Integer.parseInt(command[0]);
                    if (maxWagonCapacity - numbersList.get(i) - passengersToFit >= 0) {
                        numbersList.set(i, numbersList.get(i) + passengersToFit);
                        break;
                    } else {
                        for (int j = i + 1; j < numbersList.size(); j++) {
                            if ((numbersList.get(j) + passengersToFit) <= maxWagonCapacity) {
                                numbersList.set(j, numbersList.get(j) + passengersToFit);
                                break;
                            }
                        }
                        break;
                    }
                }
            }
            command = scanner.nextLine().split(" ");
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
