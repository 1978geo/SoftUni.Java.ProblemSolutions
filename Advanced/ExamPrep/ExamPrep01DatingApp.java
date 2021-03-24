package SoftUniJavaProblemSolutions.Advanced.ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamPrep01DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Stack
        ArrayDeque<Integer> males = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(males::push);

        // Queue
        ArrayDeque<Integer> females = Arrays.stream(scanner.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new)); // add()

        int matchCount = 0;

        while (!males.isEmpty() && !females.isEmpty()) {

            int female = females.poll();

            while (female <= 0 && !females.isEmpty()) {
                female = females.poll();
            }
            if (female % 25 == 0) {
                    females.poll();
                    continue;
                }

            int male = males.pop();

            while (male <= 0 && !males.isEmpty()) {
                males.pop();
            }
            if (male % 25 == 0) {
                int count = 2;
                while (count-- > 0 && !males.isEmpty()) {
                    males.pop();
                    if(males.isEmpty()){
                        break;
                    }
                }
            }

            if (male == female) {
                matchCount++;
            } else {
                males.push(male - 2);
            }

        }

        System.out.println("Matches: " + matchCount);

        String maleOutput = "Males left: " +
                (males.isEmpty() ? "none" :
                males.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", ")));

        System.out.println(maleOutput);

        String femaleOutput = "Females left: " +
                (females.isEmpty() ? "none" :
                        females.stream()
                                .map(String::valueOf)
                                .collect(Collectors.joining(", ")));

        System.out.println(femaleOutput);
    }
}
//•	On the first line of output - print the number of successful matches:
//        o	""
//        •	On the second line - print all males left:
//        o	If there are no males: "Males left: none"
//        o	If there are males: "Males left: {male1}, {male2}, {male3}, (…)"
//        •	On the third line - print all females left:
//        o	If there are no females: "Females left: none"
//        o	If there are females: "Females left: {female1}, {female2}, {female3}, (…)"
