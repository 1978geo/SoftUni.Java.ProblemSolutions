package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E0106BalancedParentheses2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String parentSequence = scanner.nextLine();

        ArrayDeque <Character> parenthesisStack = new ArrayDeque<>();

        for (int i = 0; i < parentSequence.length(); i++) {

            char symbol = parentSequence.charAt(i);

            if (!parenthesisStack.isEmpty()){

                char check = parenthesisStack.peek();
                if (check == '{' && symbol == '}')
                {
                    parenthesisStack.pop();
                    continue;
                }
                else if (check == '[' && symbol == ']')
                {
                    parenthesisStack.pop();
                    continue;
                }
                else if (check == '(' && symbol == ')')
                {
                    parenthesisStack.pop();
                    continue;
                }
            }
            parenthesisStack.push(symbol);
        }
        System.out.println((parenthesisStack.isEmpty() ? "YES" : "NO"));
    }
}
