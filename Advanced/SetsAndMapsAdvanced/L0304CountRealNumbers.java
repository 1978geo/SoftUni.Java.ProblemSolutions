package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class L0304CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[] realNumbers = Arrays.stream(scanner.nextLine().split("\\s+")).
                mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> realNumberCount = new LinkedHashMap<>();

        for (int i = 0; i < realNumbers.length; i++) {

            realNumberCount.putIfAbsent(realNumbers[i], 0);
            realNumberCount.put(realNumbers[i], realNumberCount.get(realNumbers[i]) + 1);

        }

        realNumberCount.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));

    }
}
