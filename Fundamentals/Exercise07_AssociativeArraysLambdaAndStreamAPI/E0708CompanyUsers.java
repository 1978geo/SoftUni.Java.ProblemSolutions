package SoftUniJavaProblemSolutions.Fundamentals.Exercise07_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class E0708CompanyUsers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, ArrayList<String>> companyInfo = new TreeMap<>();

        while (!input.equals("End")) {
            String[] info = input.split(" -> ");
            String companyName = info[0];
            String employeeID = info[1];

            companyInfo.putIfAbsent(companyName, new ArrayList<>());
            if (!companyInfo.get(companyName).contains(employeeID)) {
                companyInfo.get(companyName).add(employeeID);
            }
            input = scanner.nextLine();
        }
        companyInfo.forEach((key, value) -> {
            System.out.println(key);
            value.stream()
                    .forEach(d -> System.out.println("-- " + d));
        });
    }
}


