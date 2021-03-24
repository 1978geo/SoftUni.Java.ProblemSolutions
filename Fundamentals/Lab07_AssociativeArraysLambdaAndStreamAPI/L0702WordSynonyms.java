package SoftUniJavaProblemSolutions.Fundamentals.Lab07_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class L0702WordSynonyms {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, ArrayList<String>> wordSynonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            ArrayList<String> currentSynonym = wordSynonyms.get(word);


            if (currentSynonym == null) {
                currentSynonym = new ArrayList<>();
                wordSynonyms.put(word, currentSynonym);
            }
            currentSynonym.add(synonym);
        }

        for (Map.Entry<String, ArrayList<String>> entry : wordSynonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));

        }
    }
}
