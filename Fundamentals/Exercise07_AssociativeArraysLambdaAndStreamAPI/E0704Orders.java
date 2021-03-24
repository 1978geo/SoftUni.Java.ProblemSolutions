package SoftUniJavaProblemSolutions.Fundamentals.Exercise07_AssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class E0704Orders {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        Map<String, Double> orderTotalPriceInfo = new LinkedHashMap<>();
        Map<String, Integer> orderQuantityInfo = new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String[] info = input.split(" ");
            String product = info[0];
            double price = Double.parseDouble(info[1]);
            int quantity = Integer.parseInt(info[2]);

            orderTotalPriceInfo.putIfAbsent(product, 0.0);
            orderQuantityInfo.putIfAbsent(product, 0);

            orderQuantityInfo.put(product, orderQuantityInfo.get(product) + quantity);
            orderTotalPriceInfo.put(product, price * (orderQuantityInfo.get(product)));

            input = scanner.nextLine();
        }

        orderTotalPriceInfo.entrySet()
                .forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));

        // orderTotalPriceInfo.forEach((k,v) -> System.out.printf("%s -> %.2f%n", k, v));

    }


}
