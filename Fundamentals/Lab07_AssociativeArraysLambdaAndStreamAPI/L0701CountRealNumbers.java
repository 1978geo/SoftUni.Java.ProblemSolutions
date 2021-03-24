package SoftUniJavaProblemSolutions.Fundamentals.Lab07_AssociativeArraysLambdaAndStreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class L0701CountRealNumbers {

    private static Object Double;
    private static Object Integer;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double [] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(java.lang.Double::parseDouble)
                .toArray();

        Map <Double, Integer> realNumbers = new TreeMap<>();

        for (int i = 0; i < numbers.length; i++) {
                double num = numbers[i];
                Integer occurrences = realNumbers.get(num);
            if (occurrences == null) {
                occurrences = 0;
            }
            realNumbers.put(num,occurrences + 1);
        }

        for(Map.Entry<Double, Integer> entry: realNumbers.entrySet()){
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());

        }
    }
}
