package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class E0108SimpleTextEditor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> dataStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {

            String[] command = scanner.nextLine().split("\\s+");


            switch (command[0]) {

                case "1":


                    dataStack.push(command[1]);

                    break;
                case "2":

                    String text = dataStack.peek();
                    assert text != null;
                    String newText = text.substring(Integer.parseInt(command[1]));
                    dataStack.push(newText);
                    break;
                case "3":
                    assert dataStack.peek() != null;
                    System.out.println(dataStack.peek().charAt(Integer.parseInt(command[1]) - 1));
                    break;
                case "4":
                    if(!dataStack.isEmpty()){
                        dataStack.pop();
                    }

                    break;
                default:
                    System.out.println("error");
                    break;

            }
        }
    }
}
