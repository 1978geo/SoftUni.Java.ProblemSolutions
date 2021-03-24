package SoftUniJavaProblemSolutions.Advanced.StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L0105PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque <String> queue = new ArrayDeque<>();

        while (!input.equals("print")){

            if(!input.equals("cancel")){
                queue.offer(input);
            }
                else{
                    if(!queue.isEmpty()){
                       System.out.println("Canceled " + queue.pollFirst());
                    }
                    else{
                        System.out.println("Printer is on standby");
                    }
            }
            input = scanner.nextLine();
        }
        while (!queue.isEmpty()){
            System.out.println(queue.pollFirst());
        }
    }
}
