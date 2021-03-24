package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.Scanner;
import java.util.TreeMap;

public class E0304CountSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TreeMap<Character, Integer> symbolCount = new TreeMap<>();

        String input = scanner.nextLine();

        for (int i = 0; i < input.length(); i++) {

            if (!symbolCount.containsKey(input.charAt(i))) {
                symbolCount.put(input.charAt(i), 1);
            } else {
                symbolCount.put(input.charAt(i), symbolCount.get(input.charAt(i)) + 1);
            }
        }
        symbolCount.entrySet().forEach(e -> {
            System.out.println(e.getKey() + ": " + e.getValue() + " time/s");

        });
    }
}

