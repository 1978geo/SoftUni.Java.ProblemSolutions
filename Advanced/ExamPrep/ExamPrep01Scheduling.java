package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamPrep01Scheduling {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Stack
        ArrayDeque<Integer> tasks = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(tasks::push);

        // Queue
        ArrayDeque<Integer> threads = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new)); // add()

        int taskToBeKilled = Integer.parseInt(scanner.nextLine());


        System.out.println();
        boolean taskCompleted = false;

        while (!taskCompleted){
            int currentTask = tasks.peek();
            int currentThread = threads.pop();

            if(currentThread>=currentTask){
                tasks.poll();
            }

            if(currentTask==taskToBeKilled){
                System.out.printf("Thread with value %d killed task %d%n", currentThread, currentTask);
                threads.push(currentThread);
                taskCompleted=true;

            }
        }

        for (int i = 0; i <= threads.size(); i++) {

            System.out.print(threads.pop() + " ");

        }

    }

}
