package SoftUniJavaProblemSolutions.Fundamentals.MiddleTermExamPrep;

import java.util.Scanner;

public class ExamPrepL02ArrayModifier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("\\s+");

        int[] numbers = new int[line.length];

        for (int i = 0; i < line.length; i++) {

            int number = Integer.parseInt(line[i]);

        }
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            String[] command = input.split("\\s+");

            if (command[0].equals("swap")) {

                String temp = line[Integer.parseInt(command[1])];
                line[Integer.parseInt(command[1])] = line[Integer.parseInt(command[2])];
                line[Integer.parseInt(command[2])] = temp;
            } else if (command[0].equals("multiply")) {

                int newSwapOne = Integer.parseInt(line[Integer.parseInt(command[2])]);
                int newSwapTwo = Integer.parseInt(line[Integer.parseInt(command[1])]);
                int temp = newSwapOne * newSwapTwo;
                line[Integer.parseInt(command[1])] = String.valueOf(temp);
            } else if (command[0].equals("decrease")) {
                for (int i = 0; i < line.length; i++) {
                    line[i] = String.valueOf(Integer.parseInt(line[i]) - 1);
                }
            }

            input = scanner.nextLine();
        }
        System.out.print(line[0]);
        for (int i = 1; i < line.length; i++) {
            System.out.print(", " + line[i]);
        }
    }
}
