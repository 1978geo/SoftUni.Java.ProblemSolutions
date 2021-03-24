package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L0102SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();

        int result = 0;

        for (int i = info.length - 1; i >= 0; i--) {
            stack.push(info[i]);
        }

        while (stack.size() > 1) {
            int currentNumber = Integer.parseInt(stack.peek());
            stack.pop();
            String symbol = stack.peek();
            stack.pop();
            int nextNumber = Integer.parseInt(stack.peek());
            stack.pop();
            if (symbol.equals("+")){
                currentNumber = currentNumber + nextNumber;
            }
            else {
                currentNumber = currentNumber - nextNumber;
            }
                stack.push(String.valueOf(currentNumber));

            result = currentNumber;
        }
        System.out.println(result);
    }
}
