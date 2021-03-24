package SoftUniJavaProblemSolutions.Fundamentals.FinalExamPrep;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FinalExamPrep03ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String[]> musicInfo = new HashMap<>();
        String[] composerKey = new String[]{};
        for (int i = 0; i < n; i++) {

            String[] token = scanner.nextLine().split("\\|");
            String piece = token[0];
            String composer = token[1];
            String key = token[2];
            composerKey = new String[]{composer, key};
            musicInfo.put(piece, composerKey);

        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {
            String[] token = input.split("\\|");
            String command = token[0];
            String piece = token[1];
            switch (command) {
                case "Add":
                    String composer = token[2];
                    String key = token[3];
                    if (musicInfo.containsKey(piece)) {
                        System.out.println(piece + " is already in the collection!");
                    } else {
                        composerKey = new String[]{composer, key};
                        musicInfo.put(piece, composerKey);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    if (musicInfo.containsKey(piece)) {
                        System.out.printf("Successfully removed %s!%n", piece);
                        musicInfo.remove(piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }

                    break;
                case "ChangeKey":
                    String newKey = token[2];
                    if (musicInfo.containsKey(piece)) {
                        musicInfo.get(piece)[1] = newKey;
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        musicInfo.entrySet().stream()
                .sorted((a, b) -> {
                    int result = a.getKey().compareTo(b.getKey());
                    if (a.getKey().compareTo(b.getKey()) == 0) {
                        result = a.getValue()[0].compareTo(b.getValue()[0]);
                    }
                    return result;

                })
                .forEach(e -> System.out.printf("%s -> Composer: %s, Key: %s%n",
                        e.getKey(), e.getValue()[0], e.getValue()[1]));
    }
}
