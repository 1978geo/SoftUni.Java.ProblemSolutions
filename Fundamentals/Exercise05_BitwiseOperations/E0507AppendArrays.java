package SoftUniJavaProblemSolutions.Fundamentals.Exercise05_BitwiseOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E0507AppendArrays {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] array = scanner.nextLine().split("\\|");
        String result = "";
        for (int i = array.length-1; i >= 0 ; i--) {

            String [] newArray = array[i].split("\\s+");
            for (int j = 0; j < newArray.length; j++) {
               if(!newArray[j].equals("")){
                   String newOrder = newArray[j] + " ";
                   System.out.printf("%s", newOrder);
               }
            }
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
