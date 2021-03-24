package SoftUniJavaProblemSolutions.Fundamentals.Lab05_BitwiseOperations;

import java.text.DecimalFormat;
import java.util.*;

public class L0501SumAdjacentEqualNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = getNumbersList(scanner);
        boolean search = true;

        while (search) {
            search = false;
            for (int i = 0; i < numbersList.size() - 1; i++) {
                double currentNumber = numbersList.get(i);
                double nextNumber = numbersList.get(i + 1);

                if (currentNumber == nextNumber) {
                    numbersList.remove(i);
                    numbersList.set(i, currentNumber + nextNumber);
                    search = true;
                    break;
                }
            }
        }
        String output = joinElementsByDelimeter(numbersList, " ");
        System.out.println(output);
    }

    public static List<Double> getNumbersList(Scanner scanner) {
        String line = scanner.nextLine();
        String[] numberAsString = line.split(" ");
        List<Double> numbersList = new ArrayList<>();

        for (int i = 0; i < numberAsString.length; i++) {
            double number = Double.parseDouble(numberAsString[i]);
            numbersList.add(number);
        }
        return numbersList;
    }

    public static String joinElementsByDelimeter(List<Double> items, String delimeter) {
    String output = " ";
        for (Double item: items) {
            output+= (new DecimalFormat("0.#").format(item) + delimeter);

        }
        return output;
    }
}


//    String line = scanner.nextLine();
//    String[] numberAsString = line.split(" ");
//
//    List<Integer> numbersList = new ArrayList<>();
//
//        for (int i = 0; i < numberAsString.length; i++) {
//        int number = Integer.parseInt(numberAsString[i]);
//        numbersList.add(number);
//        }
//        for (int i = 0; i < numbersList.size(); i++) {
//        System.out.print(numbersList.get(i) + " ");
//        }

//
//List<Integer> list = new ArrayList<>();
//    int number = scanner.nextInt();
//
//        while (number != 0) {
//                list.add(number);
//
//                number = scanner.nextInt();
//                }
//                for (Integer integer : list) {
//
//                System.out.print(integer + " ");
//
//                }