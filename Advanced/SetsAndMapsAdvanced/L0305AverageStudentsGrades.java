package SoftUniJavaProblemSolutions.Advanced.SetsAndMapsAdvanced;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class L0305AverageStudentsGrades {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, ArrayList<Double>> studentGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            if (!studentGrades.containsKey(name)) {
                studentGrades.put(name, new ArrayList<>());
                studentGrades.get(name).add(grade);
            } else {

                studentGrades.get(name).add(grade);
            }

        }

        studentGrades.entrySet()
                .stream()
                .forEach(entry -> {
                    double sum = 0;
                    for (int i = 0; i < entry.getValue().size(); i++) {
                        sum += entry.getValue().get(i);
                    }
                    double avgSum = sum / entry.getValue().size();

                    System.out.print(entry.getKey() + " -> ");
                    entry.getValue().forEach(e -> System.out.printf("%.2f ", e));
                    System.out.printf("(avg: %.2f)%n", avgSum);
                });
    }
}

