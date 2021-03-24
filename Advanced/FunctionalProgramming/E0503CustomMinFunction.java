package SoftUniJavaProblemSolutions.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class E0503CustomMinFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Function<int[], Integer> getMinElement = numbers -> Arrays.stream(numbers).min().getAsInt();

             int [] numbers = Arrays.stream(scanner.nextLine().split(" ")).
                        mapToInt(element -> Integer.parseInt(element)).toArray();

             int minElement = getMinElement.apply(numbers);

//        int minElement = getMinElement(numbers);

             System.out.println(minElement);
    }
//
//    public static int getMinElement(int [] numbers){
//        return Arrays.stream(numbers).min().getAsInt();
    }

