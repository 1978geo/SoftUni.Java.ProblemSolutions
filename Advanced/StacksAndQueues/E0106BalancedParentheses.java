package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E0106BalancedParentheses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] info = scanner.nextLine().split("");
        ArrayDeque<String> leftParent = new ArrayDeque<>();
        ArrayDeque<String> rightParent = new ArrayDeque<>();

        for (int i = 0; i < info.length / 2; i++) {
            leftParent.push(info[i]);
        }

        for (int i = info.length - 1; i >= info.length / 2; i--) {
            rightParent.push(info[i]);
        }

        for (int i = 0; i < info.length / 2; i++) {

            if ((leftParent.peek().equals("(")) && rightParent.peek().equals(")")) {
                leftParent.pop();
                rightParent.pop();
            } else if ((leftParent.peek().equals("[")) && rightParent.peek().equals("]")) {
                leftParent.pop();
                rightParent.pop();
            } else if ((leftParent.peek().equals("{")) && rightParent.peek().equals("}")) {
                leftParent.pop();
                rightParent.pop();
            } else {
                System.out.println("NO");
                return;
            }
        }
        if (rightParent.isEmpty()) {
            System.out.println("YES");
        }
    }
}

//({}[]) !!! - трябва да е YES
// този вариант дава 75/100, защото не изпълнява горния тест.
//Затова е решена във вариант 2.