package SoftUniJavaProblemSolutions.Fundamentals.Lab05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L0505ListManipulationAdvanced {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = getNumbersList(scanner);

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");

            if (command[0].equals("Contains")) {
                int addNumber = Integer.parseInt(command[1]);
                if (numbersList.contains(addNumber)) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }

            }
            if (command[0].equals("Print") && (command[1].equals("odd"))) {

                for (int i = 0; i < numbersList.size(); i++) {
                    int number = numbersList.get(i);
                    if (number % 2 != 0) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            }
            if (command[0].equals("Print") && (command[1].equals("even"))) {

                for (int i = 0; i < numbersList.size(); i++) {
                    int number = numbersList.get(i);
                    if (number % 2 == 0) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            }
            if (command[0].equals("Get") && command[1].equals("sum")) {
                int sum = 0;
                for (int i = 0; i < numbersList.size(); i++) {
                    int number = numbersList.get(i);
                    sum += number;
                }
                System.out.println(sum);

            }
            if (command[0].equals("Filter") && command[1].equals(">=")) {
                int filterNumber = Integer.parseInt(command[2]);
                for (int i = 0; i < numbersList.size(); i++) {
                    int number = numbersList.get(i);
                    if (number >= filterNumber) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            }
            if (command[0].equals("Filter") && command[1].equals("<")) {
                int filterNumber = Integer.parseInt(command[2]);
                for (int i = 0; i < numbersList.size(); i++) {
                    int number = numbersList.get(i);
                    if (number < filterNumber) {
                        System.out.print(number + " ");
                    }
                }
                System.out.println();
            }
            input = scanner.nextLine();
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


