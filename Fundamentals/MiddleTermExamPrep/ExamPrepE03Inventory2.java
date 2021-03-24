package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExamPrepE03Inventory2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] collectingJournal = scanner.nextLine().split(", ");
        List<String> journal = new ArrayList<>();
        journal.addAll(Arrays.asList(collectingJournal));

        String input = scanner.nextLine();
        while (!input.equals("Craft!")) {
            String[] commands = input.split(" - ");
            String item = commands[1];

            switch (commands[0]) {
                case "Collect":
                    if (!journal.contains(item)) {
                        journal.add(item);
                    }
                    break;
                case "Drop":
                    if (!journal.contains(item)) {
                        break;
                    }
                    journal.remove(item);
                    break;
                case "Combine Items":
                    String[] separatedItem = item.split(":");
                    for (int i = 0; i < journal.size(); i++) {
                        if (journal.get(i).equals(separatedItem[0])) {
                            journal.add(i + 1, separatedItem[1]);
                            break;
                        }
                    }
                    break;
                case "Renew":
                    if (journal.contains(item)) {
                        journal.remove(item);
                        journal.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.print(String.join(", ", journal));
    }
}

