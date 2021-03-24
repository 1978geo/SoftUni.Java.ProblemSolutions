package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExamPrepE03Inventory {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] collectingJournal = scanner.nextLine().split(", ");
        List<String> journal = new ArrayList<>();
        journal.addAll(Arrays.asList(collectingJournal));

        if (!journal.isEmpty()) {
            String input = scanner.nextLine();
            while (!input.equals("Craft!")) {
                String[] commands = input.replace(":", " - ").split(" - ");

                for (int i = 0; i < commands.length; i++) {

                    if (commands[0].equals("Collect")) {
                        for (int j = 0; j < journal.size(); j++) {
                            if (commands[1].equals(journal.get(j))) {
                                break;
                            }
                        }
                        journal.add(commands[1]);
                        break;
                    }
                    if (commands[0].equals("Drop")) {
                        for (int j = 0; j < journal.size(); j++) {
                            if (commands[1].equals(journal.get(j))) {
                                journal.remove(commands[1]);
                            }
                        }
                        break;
                    }
                    if (commands[0].equals("Combine Items")) {
                        for (int j = 0; j < journal.size(); j++) {
                            if (commands[1].equals(journal.get(j))) {
                                journal.add(j + 1, commands[2]);
                                break;
                            }
                        }
                        break;
                    }
                    if (commands[0].equals("Renew")) {
                        for (int j = 0; j < journal.size(); j++) {
                            if (commands[1].equals(journal.get(j))) {
                                String temporary = commands[1];
                                journal.remove(j);
                                journal.add(temporary);
                                break;
                            }
                        }
                        break;
                    }
                }
                input = scanner.nextLine();
            }
            System.out.print(journal.get(0));
            for (int i = 1; i < journal.size(); i++) {
                System.out.print(", " + journal.get(i));
            }
        }
    }
}
