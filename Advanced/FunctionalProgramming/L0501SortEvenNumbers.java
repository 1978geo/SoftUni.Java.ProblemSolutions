package SoftUniJavaProblemSolutions.Advanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class L0501SortEvenNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] info = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .filter(n -> n%2==0)
                .toArray();

        System.out.println(formatArray(info));

        Arrays.sort(info);

        System.out.println(formatArray(info));

    }
        public  static  String formatArray(int[]arr){

                    return  Arrays.stream(arr)
                            .mapToObj(String::valueOf)
                            .collect(Collectors.joining(", "));
        }

    }



