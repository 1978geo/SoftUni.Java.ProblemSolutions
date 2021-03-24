package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamPrep01Wreaths {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Stack
        ArrayDeque<Integer> lilies = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .forEach(lilies::push);

        // Queue
        ArrayDeque<Integer> roses = Arrays.stream(scanner.nextLine()
                .split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new)); // add()

        int wreaths = 0;
        int reservedFlowers = 0;

        while (!lilies.isEmpty()&& !roses.isEmpty()){

            int lily = lilies.pop();
            int rose = roses.peek();
            int sum = lily+rose;

            if (sum==15){
                roses.poll();
                wreaths++;
            }
            else if (sum<15){
                roses.poll();
                reservedFlowers+=sum;
            }
            else {
                lilies.push(lily-2);
            }

        }

        if(wreaths>=5){
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreaths);
        } else {
            int additionalWreaths = reservedFlowers/15;
            wreaths+=additionalWreaths;

            if(wreaths>=5){
                System.out.printf("You made it, you are going to the competition with %d wreaths!", wreaths);
            } else {
                System.out.printf("You didn't make it, you need %d wreaths more!", 5-wreaths);
            }
        }
    }

}
