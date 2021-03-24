package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExamPrepE03MovingTarget {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> targetList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        if(!targetList.isEmpty()) {

        String input = scanner.nextLine();


            while (!input.equals("End")) {
                String[] command = input.split("\\s+");
                String order = command[0];
                int givenIndex = Integer.parseInt(command[1]);
                int action = Integer.parseInt(command[2]);

                switch (order) {

                    case "Shoot":
                        if (givenIndex>=0 && givenIndex < targetList.size()) {
                            targetList.set(givenIndex, targetList.get(givenIndex) - action);
                            if ((targetList.get(givenIndex) - action) < 0) {
                                targetList.remove(givenIndex);
                            }
                        }
                        break;
                    case "Add":
                        if (givenIndex>=0 && givenIndex < targetList.size()) {
                            targetList.add(givenIndex, action);
                        } else {
                            System.out.println("Invalid placement!");
                        }
                        break;
                    case "Strike":
                        if (((action * 2 + 1) <= targetList.size() && givenIndex - action >= 0 && givenIndex + action <= targetList.size()-1)) {
                            for (int i = givenIndex + action; i >= givenIndex - action; i--) {
                                targetList.remove(i);
                            }
                        } else {
                            System.out.println("Strike missed!");
                        }
                        break;
                }
                input = scanner.nextLine();
            }
            System.out.printf("%d", targetList.get(0));
            if (targetList.size() > 0) {
                for (int i = 1; i < targetList.size(); i++) {
                    System.out.print("|" + targetList.get(i));
                }
            }
        }
    }
}
