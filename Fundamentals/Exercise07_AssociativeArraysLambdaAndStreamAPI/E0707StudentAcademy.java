package SoftUniJavaProblemSolutions.Fundamentals.Exercise07_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class E0707StudentAcademy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map <String, ArrayList<Double>> studentInfo = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String name = scanner.nextLine();
            double averageGrade = Double.parseDouble(scanner.nextLine());
            studentInfo.putIfAbsent(name, new ArrayList<>());
            studentInfo.get(name).add(averageGrade);
        }

        studentInfo.entrySet().stream().
                filter(s -> s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble() >= 4.50)
                .sorted((f,s) ->  {
                    double firstAv = f.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    double secondAv = s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble();
                    return Double.compare(secondAv, firstAv);

                }).forEach(s -> {
                    System.out.printf("%s -> %.2f%n", s.getKey(), s.getValue().stream().
                            mapToDouble(Double::doubleValue).average().getAsDouble());
        });

    }
}
