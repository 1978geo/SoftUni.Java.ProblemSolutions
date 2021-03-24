package SoftUniJavaProblemSolutions.Fundamentals.Exercise07_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class E0706Courses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        Map<String, ArrayList<String>> coursesInfo = new LinkedHashMap<>();

        while (!input.equals("end")) {
            String[] info = input.split(" : ");
            String courseName = info[0];
            String regStudents = info[1];


            if (!coursesInfo.containsKey(courseName)) {
                coursesInfo.putIfAbsent(courseName, new ArrayList<>());
                List<String> currentRegStudent = coursesInfo.get(courseName);
                currentRegStudent.add(regStudents);
            } else {
                List<String> currentRegStudent = coursesInfo.get(courseName);
                currentRegStudent.add(regStudents);
            }

            input = scanner.nextLine();
        }

        coursesInfo.entrySet().stream()
                .sorted((f, s) -> s.getValue().size() - f.getValue().size())
                .forEach(e -> {
                    System.out.println(e.getKey() + ": " + e.getValue().size());
                e.getValue()
                        .stream()
                        .sorted((f,s) -> f.compareTo(s))
                        .forEach(s -> System.out.println("-- " + s));
                });



//        List<Map.Entry<String, ArrayList>> toSort = new ArrayList<>();
//        for (Map.Entry<String, ArrayList> entry : coursesInfo.entrySet()) {
//            toSort.add(entry);
//        }
//        toSort.sort((f, s) -> s.getValue().size() - f.getValue().size());
//        for (Map.Entry<String, ArrayList> entry : toSort) {
//            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());
//            entry.getValue().stream()
////                    .sorted((f, s) -> String.compareTo(f, s))
//                    .forEach(s -> System.out.println("-- " + entry.getValue()));
//        }

    }
}
