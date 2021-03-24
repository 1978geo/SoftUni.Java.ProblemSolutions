package SoftUniJavaProblemSolutions.Fundamentals.Exercise07_AssociativeArraysLambdaAndStreamAPI;


import java.util.*;

public class E0702AMinerTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> resourcesCollection = new LinkedHashMap<>();

        while (!input.equals("stop")) {
            String resource = input;
            int currentQuantity = Integer.parseInt(scanner.nextLine());

            if (resourcesCollection.containsKey(resource)) {

                int quantity = resourcesCollection.get(input) + currentQuantity;
                resourcesCollection.put(resource, quantity);
            }
            resourcesCollection.putIfAbsent(resource, currentQuantity);

            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourcesCollection.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
