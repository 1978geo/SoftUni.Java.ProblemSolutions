package SoftUniJavaProblemSolutions.Fundamentals.Lab07_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class L0703OddOccurrences {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split(" ");
        Map<String, Integer> words = new LinkedHashMap<>();

        for (int i = 0; i < info.length; i++) {
            String currentWord = info[i].toLowerCase();
            Integer occurrences = words.get(currentWord);
            if (words.get(currentWord) == null) {
                occurrences = 0;
                words.put(currentWord, 0);
            }
            words.put(currentWord, occurrences + 1);
        }
        List<String> oddList = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                oddList.add(entry.getKey());
            }
        }
        System.out.print(oddList.get(0));
        for (int i = 1; i < oddList.size(); i++) {
            System.out.print(", " + oddList.get(i));
        }
    }
}
