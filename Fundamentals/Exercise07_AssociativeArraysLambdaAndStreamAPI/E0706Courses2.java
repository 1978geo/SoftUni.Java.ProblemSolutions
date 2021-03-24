package SoftUniJavaProblemSolutions.Fundamentals.Exercise07_AssociativeArraysLambdaAndStreamAPI;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class E0706Courses2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            String input = scanner.nextLine();


            Map<String, ArrayList> coursesInfo = new TreeMap<>();

            while (!input.equals("end")) {
                String[] info = input.split(" : ");
                String courseName = info[0];
                String regStudents = info[1];


                if (!coursesInfo.containsKey(courseName)) {
                    coursesInfo.putIfAbsent(courseName, new ArrayList());
                    ArrayList<String> currentRegStudent = coursesInfo.get(courseName);
                    currentRegStudent.add(regStudents);
                } else {
                    ArrayList<String> currentRegStudent = coursesInfo.get(courseName);
                    currentRegStudent.add(regStudents);
                }

                input = scanner.nextLine();
            }

            coursesInfo.entrySet().stream()
                    .sorted((f, s) -> s.getValue().size() - f.getValue().size())
                    .forEach(entry -> {
                        System.out.printf(" %s: %d%n", entry.getKey(), entry.getValue().size());


                    });



    }
}

