package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamPrepE02ShoppingList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> shoppingList = Arrays.stream(scanner.nextLine().split("!"))
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("Go Shopping!")) {

            String[] orders = input.split("\\s+");

            String command = orders[0];
            String item = orders[1];

            switch (command) {
                case "Urgent":
                    if (!shoppingList.contains(item)) {
                        shoppingList.add(0, item);
                    }
                    break;
                case "Unnecessary":
                    if (!shoppingList.contains(item)) {
                        break;
                    }
                    shoppingList.remove(item);
                    break;
                case "Correct":
                    for (int i = 0; i < shoppingList.size(); i++) {
                        if (shoppingList.get(i).equals(item)) {
                            shoppingList.set(i, orders[2]);
                            break;
                        }
                    }
                    break;
                case "Rearrange":
                    if (shoppingList.contains(item)) {
                        shoppingList.remove(item);
                        shoppingList.add(item);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.print(String.join(", ", shoppingList));
    }
}
