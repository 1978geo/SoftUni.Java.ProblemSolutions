package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L0101BrowserHistory {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String text = scanner.nextLine();

        String currentURL = null;

        while (!text.equals("Home")) {

            if (text.equals("back")) {

                if (stack.isEmpty()) {
                    System.out.println("no previous URLs");
                    text = scanner.nextLine();
                    continue;
                }
                else {
                    currentURL = stack.pop();
                }
            }
            else{
                if(currentURL!=null){
                    stack.push(currentURL);
                }
                currentURL = text;
            }
            System.out.println(currentURL);

            text = scanner.nextLine();

        }
    }
}
