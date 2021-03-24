package SoftUniJavaProblemSolutions.Fundamentals.Exercise07_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class E0701CountCharsInAString {

    private static Object Double;
    private static Object Integer;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String [] info = scanner.nextLine().split("");

        Map<String, Integer> letters = new LinkedHashMap<>();


        for (int i = 0; i < info.length; i++) {
            String symbol = info[i];
            Integer occurrences = letters.get(symbol);
            if (occurrences == null) {
                occurrences = 0;
            }
            letters.put(symbol,occurrences + 1);
        }
        for(Map.Entry<String, Integer> entry: letters.entrySet()){
            if(!entry.getKey().equals(" "))
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
