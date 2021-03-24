package SoftUniJavaProblemSolutions.Fundamentals.Lab05_BitwiseOperations;

import java.util.*;

public class L0506ListOfProducts {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfProducts = Integer.parseInt(scanner.nextLine());

        List<String> productsList = new ArrayList<>();

        for (int i = 0; i < numberOfProducts; i++) {
            String productName = scanner.nextLine();
            productsList.add(productName);
        }
        Collections.sort(productsList);

        for (int i = 0; i < productsList.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, productsList.get(i));

        }
    }
}