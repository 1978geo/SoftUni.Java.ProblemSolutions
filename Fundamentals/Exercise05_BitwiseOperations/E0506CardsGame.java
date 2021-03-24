package SoftUniJavaProblemSolutions.Fundamentals.Exercise05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E0506CardsGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersListOne = getNumbersList(scanner);
        List<Integer> numbersListTwo = getNumbersList(scanner);

        while (!(numbersListOne.isEmpty() || numbersListTwo.isEmpty())){

                int cardPlayerOne = numbersListOne.get(0);
                int cardPlayerTwo = numbersListTwo.get(0);
                numbersListOne.remove(0);
                numbersListTwo.remove(0);
                if(cardPlayerOne>cardPlayerTwo){
                    numbersListOne.add(cardPlayerOne);
                    numbersListOne.add(cardPlayerTwo);
                }
                else if(cardPlayerOne<cardPlayerTwo){
                    numbersListTwo.add(cardPlayerTwo);
                    numbersListTwo.add(cardPlayerOne);
                }
        }
            if(numbersListOne.isEmpty()){
                int sum=0;
                for (int i = 0; i < numbersListTwo.size(); i++) {
                    int number = numbersListTwo.get(i);
                    sum += number;
                }
                System.out.printf("Second player wins! Sum: %d", sum);
            } else {
                int sum=0;
                for (int i = 0; i < numbersListOne.size(); i++) {
                    int number = numbersListOne.get(i);
                    sum += number;
                }
                System.out.printf("First player wins! Sum: %d", sum);
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
