package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.*;

public class ExamPrepL03Numbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = getNumbersList(scanner);

        int countOfNumbers = numbersList.size();
        if (countOfNumbers <= 1) {
            System.out.println("No");
        } else {
            int sumOfNumbers = 0;

            for (int i = 0; i < numbersList.size(); i++) {

                int temporaryNumber = numbersList.get(i);
                sumOfNumbers += temporaryNumber;

            }

            double averageValue = sumOfNumbers * 1.0 / countOfNumbers;

            List<Integer> newNumbersList = new ArrayList<>();
            int counter = 0;
            for (int i = 0; i < numbersList.size(); i++) {

                int temporaryNumber = numbersList.get(i);


                if (temporaryNumber > averageValue) {
                    counter++;
                    newNumbersList.add(temporaryNumber);
                }

            }
            if (counter > 5) {
                Collections.sort(newNumbersList, Collections.reverseOrder());
                for (int j = 0; j < 5; j++) {
                    System.out.print(newNumbersList.get(j) + " ");
                }
            } else if (counter > 0 && counter <= 5) {
                Collections.sort(newNumbersList, Collections.reverseOrder());
                for (int j = 0; j < newNumbersList.size(); j++) {
                    System.out.print(newNumbersList.get(j) + " ");
                }
            } else {
                System.out.println("No");
            }

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
