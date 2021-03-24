package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class E0103MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> numberStack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {

            String[] command = scanner.nextLine().split("\\s+");

            int firstCommand = Integer.parseInt(command[0]);

            switch (firstCommand) {
                case 1:
                    int numberToPush = Integer.parseInt(command[1]);
                    numberStack.push(numberToPush);

                    break;
                case 2:
                    if (!numberStack.isEmpty()) {

                        numberStack.pop();
                    }

                    break;
                case 3:
                    if (!numberStack.isEmpty()) {
                        System.out.println(Collections.max(numberStack));
                    }

                    break;
            }

        }

    }
}
