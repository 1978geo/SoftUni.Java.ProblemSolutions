package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E0101ReverseNumbersWithaStack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int [] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToInt(element -> Integer.parseInt(element)).toArray();

        ArrayDeque <Integer> stackNumbers = new ArrayDeque<>();

        for (int i = 0; i < numbers.length; i++) {

            stackNumbers.push(numbers[i]);

        }
        while (stackNumbers.size()>0){
            System.out.print(stackNumbers.pop() + " ");
        }

    }

}
